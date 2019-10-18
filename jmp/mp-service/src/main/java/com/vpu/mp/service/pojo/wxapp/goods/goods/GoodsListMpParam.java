package com.vpu.mp.service.pojo.wxapp.goods.goods;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.elasticsearch.search.aggregations.bucket.terms.InternalTerms;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 李晓冰
 * @date 2019年10月12日
 * 装修组件中商品组件相关请求参数类
 */
@Data
public class GoodsListMpParam {
    /**
     * 0 自动推荐 1手动推荐
     */
    @JsonProperty("recommend_type")
    private Integer recommendType;

    @JsonProperty("goods_items")
    private List<Integer> goodsItems;
    /**
     * 关键词,匹配商品名称
     */
    private String keywords;
    /**
     * 商品最低价格
     */
    @JsonProperty("min_price")
    private BigDecimal minPrice;
    /**
     * 商品最高价格
     */
    @JsonProperty("max_price")
    private BigDecimal maxPrice;
    /**
     * 所属平台分类id集合，根据php定义的，但是php版本未看到前端传入相关参数
     */
    private String category;


    public static final String All_AREA="all";
    public static final String SORT_AREA = "sort";
    public static final String CAT_AREA = "cat";
    public static final String BRAND_AREA = "brand";
    public static final String LABEL_AREA = "label";
    /**
     * 商品范围：all,sort,cat,brand,label
     */
    @JsonProperty("goods_area")
    private String goodsArea;
    /**
     * 范围集合
     */
    @JsonProperty("goods_area_data")
    private List<Integer> goodsAreaData;

    /**
     *  商品活动类型默认0，1拼团，2 会员专享，3砍价，5秒杀，6限时降价
     */
    public static final byte GOODS_TYPE_IS_CARD_EXCLUSIVE = 2 ;
    @JsonProperty("goods_type")
    private Byte goodsType;

    public static final Byte ADD_TIME_SORT=1;
    public static final Byte SALE_NUM_SORT=1;
    public static final Byte SHOP_PRICE_SORT=1;
     /**
     * 排序：1 按商品上新时间倒序排列（goodsId排序），2 按商品销量倒序排列,3 按商品价格正序排列（由低到高）
     */
    @JsonProperty("sort_type")
    private Byte sortType;

    /**
     * 需要展示的商品最大数量
     */
    @JsonProperty("goods_num")
    private Integer goodsNum;

    /**
     * 是否展示售罄商品 1展示 0否
     */
    private Byte soldOutGoodsShow;
}
