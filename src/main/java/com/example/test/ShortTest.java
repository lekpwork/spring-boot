package com.example.test;

import com.example.Log.LogUtil;

import java.text.ParseException;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/6/22 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class ShortTest {
    public static void main(String[] args) throws ParseException {
        Integer a=-1;
        if ("-1".equals(a.toString())){
            LogUtil.debug("3");
        }else{
            LogUtil.debug("2");
        }
    }
}
