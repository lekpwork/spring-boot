package com.example.test.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/1 </div>
 *
 * @author lekp
 * @since 1.0
 */
@Component
@PropertySource(value = "/test.properties",encoding = "utf-8")
public class People {
    @Value("${name}")
    private String name;

    @Value("${sex}")
    private String sex;

    @Value("${age}")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
