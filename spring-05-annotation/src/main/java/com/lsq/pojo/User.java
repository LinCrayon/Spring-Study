package com.lsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author linshengqian
 */
//@Autowired是按类型自动转配的，不支持id匹配。(需要导入 spring-aop的包！)

public class User {
    //如果允许对象为null，设置required = false,默认为true
    @Autowired(required = false)
    @Qualifier(value = "cat2")
    private Cat cat;

    @Resource(name = "dog2")
    private Dog dog;
    private String str;
    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }

}
