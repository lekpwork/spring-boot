package com.example.frm.aop;

import com.example.Log.LogUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/8/30</div>
 *
 * @author lekp
 * @since 1.0
 */
@Aspect
@Component
public class RecourceAop {

    @Pointcut("execution(* com.example.test.controller.TestResource.*(..))")
    public void doPoint(){
    }

//    @Before("doPoint()")
//    public void doBefore(){
//        LogUtil.debug("锄禾日当午");
//    }

    @Around("doPoint()")
    public void doAop(ProceedingJoinPoint pjp){
        LogUtil.debug("但愿人长久");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
