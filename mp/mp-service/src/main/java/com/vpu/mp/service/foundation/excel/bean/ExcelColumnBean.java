package com.vpu.mp.service.foundation.excel.bean;

/**
 * @author 李晓冰
 * @date 2019年07月18日
 */
public class ExcelColumnBean {

    public String columnName;

    public int columnIndex = -1;

    public String formatStr;

    public boolean notNull=false;

    public Class<?> fieldClazz;

    public String[] args;

}
