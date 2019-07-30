package com.vpu.mp.service.foundation.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.vpu.mp.service.foundation.excel.bean.ExcelColumnBean;
import com.vpu.mp.service.foundation.excel.bean.ExcelSheetBean;
import com.vpu.mp.service.foundation.excel.exception.IllegalExcelDataException;
import com.vpu.mp.service.foundation.excel.exception.IllegalExcelHeaderException;
import com.vpu.mp.service.foundation.excel.exception.IllegalSheetPositionException;
import com.vpu.mp.service.foundation.excel.exception.handler.IllegalExcelBinder;
import com.vpu.mp.service.foundation.excel.exception.handler.IllegalExcelHandler;

/**
 * @author 李晓冰
 * @date 2019年07月18日
 */
public class ExcelReader extends AbstractExcelDisposer {

    private Workbook workbook;

    private IllegalExcelHandler illegalHandler;

    public ExcelReader(Workbook workbook, IllegalExcelHandler illegalHandler) {
        this(AbstractExcelDisposer.DEFAULT_LANGUAGE, workbook, illegalHandler);
    }

    public ExcelReader(String language, Workbook workbook, IllegalExcelHandler illegalHandler) {
        super(language);
        this.workbook = workbook;
        this.illegalHandler = illegalHandler;
    }

    /**
     * 根据model对象解析excel
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> readModelList(Class<T> clazz) {
        List<T> modelList = new ArrayList<>();

        ExcelSheetBean sheetBean = null;
        try {
            sheetBean = initSheet(clazz);

            buildColumnMapWithCheckWorkbook(sheetBean);
        } catch (IllegalSheetPositionException | IllegalExcelHeaderException e) {
            return modelList;
        }

        Sheet sheet = workbook.getSheetAt(sheetBean.sheetNum);
        for (int rowNum = sheetBean.beginDataNum; rowNum <= sheet.getLastRowNum(); rowNum++) {
            Row data = sheet.getRow(rowNum);

            if (data == null) {
                continue;
            }

            T it = null;
            try {
                it = converRowToObj(sheetBean.columnMap, data, clazz);
            } catch (Exception e) {
                continue;
            }

            modelList.add(it);
        }

        return modelList;
    }

    /**
     * 初始化excel列和Model字段的对应关系，同时检测excel的正确性
     *
     * @param sheetBean
     * @throws IllegalSheetPositionException
     * @throws IllegalExcelHeaderException
     * @throws IllegalExcelDataException
     */
    private void buildColumnMapWithCheckWorkbook(ExcelSheetBean sheetBean) throws IllegalSheetPositionException, IllegalExcelHeaderException {
        Sheet sheet = workbook.getSheetAt(sheetBean.sheetNum);

        if (sheet == null) {
            illegalHandler.handleIllegalParse(IllegalExcelBinder.createIllegalSheetBinder(sheetBean.sheetNum, workbook));
            throw new IllegalSheetPositionException();
        }

        Row headRow = sheet.getRow(sheetBean.headLineNum);
        if (headRow == null) {
            illegalHandler.handleIllegalParse(IllegalExcelBinder.createHeadIsNullInfo());
            throw new IllegalExcelHeaderException();
        }

        short firstCellNum = headRow.getFirstCellNum();
        short lastCellNum = headRow.getLastCellNum();

        Map<String, ExcelColumnBean> columnMap = sheetBean.columnMap;

        //设置excel 列和类字段的对应关系，并判断是否有错误（最终是根据索引对应）
        for (Map.Entry<String, ExcelColumnBean> entry : columnMap.entrySet()) {
            ExcelColumnBean columnBean = entry.getValue();
            int columnIndex = columnBean.columnIndex;

            //设置了列索引，但是越界了
            boolean isWrongIndex = columnIndex != -1 && (columnIndex < firstCellNum || columnIndex >= lastCellNum);
            if (isWrongIndex) {
                IllegalExcelBinder.createIllegalHeadInfo(headRow);
                throw new IllegalExcelHeaderException();
            }

            //设置了合法列索引
            if (columnIndex != -1) {
                String cellValue = ExcelUtil.getCellStringValue(headRow.getCell(columnIndex));
                columnBean.columnName = cellValue;
                continue;
            }

            //至此，model的该字段未设置sheet对应列的索引
            String columnName = columnBean.columnName;

            //根据设置的列名称查找对应索引
            for (int i = firstCellNum; i < lastCellNum; i++) {
                Cell cell = headRow.getCell(i);
                String cellValue = ExcelUtil.getCellStringValue(cell);

                if (cellValue == null || !cellValue.equals(columnName)) {
                    continue;
                }
                columnBean.columnIndex = i;
            }
            //类字段在excel head里没有对应索引
            if (columnBean.columnIndex == -1) {
                illegalHandler.handleIllegalParse(IllegalExcelBinder.createIllegalHeadInfo(headRow));
                throw new IllegalExcelHeaderException();
            }
        }
    }

    private <T> T converRowToObj(Map<String, ExcelColumnBean> headParamMap, Row row, Class<T> clazz) throws Exception {
        T instant = clazz.newInstance();

        for (Map.Entry<String, ExcelColumnBean> entry : headParamMap.entrySet()) {
            String filedName = entry.getKey();
            int columnIndex = entry.getValue().columnIndex;
            boolean notNull = entry.getValue().notNull;

            Cell cell = row.getCell(columnIndex);

            if (cell == null) {
                if (!notNull) {
                    continue;
                } else {
                    illegalHandler.handleIllegalParse(IllegalExcelBinder.createIllegalDataInfo(row));
                    throw new IllegalExcelDataException();
                }
            }
            String cellValue = ExcelUtil.getCellStringValue(cell, workbook);

            if (cellValue == null) {
                if (!notNull) {
                    continue;
                } else {
                    illegalHandler.handleIllegalParse(IllegalExcelBinder.createIllegalDataInfo(row));
                    throw new IllegalExcelDataException();
                }
            }


            try {
                ExcelUtil.setFieldValue(clazz.getDeclaredField(filedName), instant, cellValue);
            } catch (Exception e) {
                illegalHandler.handleIllegalParse(IllegalExcelBinder.createIllegalDataInfo(row));
                throw e;
            }

        }
        return instant;
    }
}
