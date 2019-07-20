package com.hawcore.framework.multiplyds.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//@Component

public class MyCustomPointcut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> aClass) {
//        System.out.println(aClass.getName());
        if (aClass.getName().startsWith("com.hawcore.framework.multiplyds.service")) {
            System.out.println(aClass.getName());
        }
        return aClass.getName().endsWith("com.hawcore.framework.multiplyds.service");
    }

    public MyCustomPointcut() {
    }

}
