package com.example.frm.aop;

import com.example.Log.LogUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/25 </div>
 *
 * @author lekp
 * @since 1.0
 */
@Component
@Aspect
public class StartAOP {

    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public Object doLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LogUtil.debug("欢迎进入aop");
        MethodSignature methodSignature =(MethodSignature)proceedingJoinPoint.getSignature();
        Method method=methodSignature.getMethod();
        if (method.isAnnotationPresent(TestAOP.class)){
            LogUtil.debug("此处是自定义注解");
            return proceedingJoinPoint.proceed();
        }else {
            LogUtil.debug("此处没有加入自定义注解");
            return proceedingJoinPoint.proceed();
        }
    }
}
