package com.haibo.controller;

import com.fasterxml.jackson.databind.util.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/4/16/016
 */
public class CustomConverter implements Converter<String, Date> {

    // 实现将日期串转换为日期类型
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 如果参数绑定失败，返回null
        return null;
    }

}