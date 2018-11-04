package com.example.frm.aop;

import com.example.Log.LogUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/9/6</div>
 *
 * @author lekp
 * @since 1.0
 */
@Component
@Aspect
public class AroundAop {

    @Around("execution(* com.example.test.controller.TestResource.*(..))")
    public void doAop(ProceedingJoinPoint pjp){
        LogUtil.debug("这里是环绕aop");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
