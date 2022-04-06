package com.lsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author linshengqian
 */
//@Autowired是按类型自动转配的，不支持id匹配。(需要导入 spring-aop的包！)

@Component("user")   // (Bean的实现)
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Controller("user")
@Scope("prototype")
public class User {
    //如果允许对象为null，设置required = false,默认为true
    @Autowired(required = false)
    @Qualifier(value = "cat2")
    private Cat cat;

    @Resource(name = "dog2")
    private Dog dog;
    private String str;

    // 相当于配置文件中 <property name="name" value="linshengqian"/>
    @Value("linshengqian")
    public String name;// = "linshengqian";


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

//作用域
//@scope
//singleton：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
//prototype：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收