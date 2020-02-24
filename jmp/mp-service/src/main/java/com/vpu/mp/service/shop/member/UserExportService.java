package com.vpu.mp.service.shop.member;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.member.MemberPageListParam;
import com.vpu.mp.service.pojo.shop.member.userExp.UserExcelModel;
import com.vpu.mp.service.pojo.shop.member.userExp.UserExpParam;
import com.vpu.mp.service.pojo.shop.member.userExp.UserExpVo;
import com.vpu.mp.service.shop.member.dao.MemberDaoService;

@Service
public class UserExportService extends ShopBaseService{
	@Autowired
	private MemberDaoService memDao;
	/**
	 * 	用户可选的全部数据
	 */
	private static final String ALL_CFG="all_cfg";
	/**
	 * 	用户已经选择过的数据
	 */
	private static final String CHOOSED_CFG="choosed_cfg";
	/**
	 * 	默认最多导出数据5000条
	 */
	private static final String MAX__KEY = "max_num";
	private static final Integer MAX_VALUE = 5000;
	/**
	 * 	第一行固定的值
	 */
	private static final String firstColName;
	/**
	 * 	初始化excel第一列固定的值
	 */
	static {
		System.out.println("初始化固定的第一行");
		Class<?> clazz = UserExpVo.class;
		String tmpName = null;
		for(Field field: clazz.getDeclaredFields()) {
			JsonProperty anno = field.getAnnotation(JsonProperty.class);
			if(anno != null && anno.required() ) {
				tmpName = anno.value();
				break;
			}
		}
		firstColName = tmpName;
	}
	/**
	 * 	导出用户
	 */
	public void userExport(MemberPageListParam mParam) {
		UserExpParam param = mParam.getUserExpParam();
		//	确保导出的数据是在0-5000条之间
		Integer startNum = param.getStartNum();
		if(startNum==null || startNum<0) {
			param.setStartNum(NumberUtils.INTEGER_ZERO);
		}
		Integer endNum = param.getEndNum();
		if(endNum==null || endNum>MAX_VALUE) {
			param.setEndNum(MAX_VALUE);
		}
		//	TODO	模拟查询数据库
		List<UserExpVo> data = memDao.getExportAllUserList(mParam);
		
		List<UserExcelModel> excelModel = new ArrayList<>();
		List<String> columns = null;
		for(UserExpVo vo: data) {
			Map<String, Object> uExpMap = changeUserExpVo2Map(vo);
			columns = param.getColumns();
			// 	循环
			//	创建UserExcelModel
			UserExcelModel model = new UserExcelModel();
			
			
			Map<String,Object> map = new LinkedHashMap<>();
			for(String key: columns) {
				// TODO	直接获取的数据
				if(uExpMap.containsKey(key)) {
					if(firstColName!=null && firstColName.equals(key)){
						//	目前excel默认了userId为第一项固定值
						Integer userId = (Integer)uExpMap.get(key);
						model.setUserId(userId);
					}else {
						map.put(key, uExpMap.get(key));
					}
				}else {
					// TODO	进一步需要处理的数据
					logger().info("查询其他数据");
				}
				
				
				
			}
			model.setOther(map);
		}
			
		

		
	}
	
	public Map<String, Object> changeUserExpVo2Map(UserExpVo vo) {
		Map<String,Object> map = new HashMap<>();
		Field[] fields = vo.getClass().getDeclaredFields();
		for(Field field: fields) {
			JsonProperty anno = field.getAnnotation(JsonProperty.class);
			if(anno != null) {
				field.setAccessible(true);
				try {
					map.put(anno.value(), field.get(vo));
				} catch (Exception e) {
					map.put(anno.value(), null);
				} 
			}
		}
		System.out.println(map);
		return map;
	}
	
	
	
	
	
	/**
	 * 	获取用户导出配置
	 * @return ObjectNode 用户可选的导出数据以及历史选择的导出数据
	 */
	public ObjectNode getExportCfg() {
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode ob = mapper.createObjectNode();
		JsonNode ars = mapper.valueToTree(getAllExportCfg());
		ob.set(ALL_CFG, ars);
		//TODO 从数据取数据
		ob.set(CHOOSED_CFG, null);
		//	设置允许导出最大数量
		JsonNode maxNum = mapper.valueToTree(MAX_VALUE);
		ob.set(MAX__KEY, maxNum);
		return ob;
	}
	
	/**
	 * 	获取所有可选的配置信息
	 */
	private List<String> getAllExportCfg(){
		//		全部可选的信息
		Class<?> clazz = UserExpVo.class;
		Field[] fields = clazz.getDeclaredFields();
		if(fields != null) {
			int length = fields.length;
			List<String> cons = new ArrayList<>(length);
			
			for(Field field: fields) {
				JsonProperty props = field.getDeclaredAnnotation(JsonProperty.class);
				if(props != null) {
					cons.add(props.index(), props.value());
				}
			}
			return cons;
		}else {
			return Collections.emptyList();
		}
	}
}
