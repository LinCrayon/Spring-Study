package com.lsq.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author linshengqian
 */
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
        System.out.println( o.getClass().getName() + "的" + method.getName()
                + "方法被执行了");
    }
}
