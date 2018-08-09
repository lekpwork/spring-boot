package com.example.Log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/1 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class LogUtil {
    private static final Logger log = LoggerFactory.getLogger(LogUtil.class);

    public static void debug(String message){
        if (log.isDebugEnabled()) {
            log.debug(message);
        }
    }
}
