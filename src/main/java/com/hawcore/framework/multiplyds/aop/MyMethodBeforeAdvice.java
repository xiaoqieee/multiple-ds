package com.hawcore.framework.multiplyds.aop;

import org.aspectj.lang.annotation.AdviceName;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//@Component
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before_________");
    }
}
