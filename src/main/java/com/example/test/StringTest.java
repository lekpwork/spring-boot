package com.example.test;

import com.example.Log.LogUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/8/14</div>
 *
 * @author lekp
 * @since 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        short a=1;
        Double b=2.000;
        System.out.println(a/2);
        if ("A".equals(null)){
            LogUtil.debug("1111");
        }else {
            LogUtil.debug("2222");
        }
        StringUtils.isNotBlank("1");
    }

}
