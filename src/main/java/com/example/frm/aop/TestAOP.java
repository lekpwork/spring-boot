package com.example.frm.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/25 </div>
 *
 * @author lekp
 * @since 1.0
 */
//target说明了注解所修饰的对象范围,METHOD用于描述方法,Type用于描述类、接口（包括注解类型）或enum声明
@Target({ElementType.METHOD,ElementType.TYPE})
//Retention说明了注解被保留的时间长短，RUNTIME运行时有效
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAOP {

}
