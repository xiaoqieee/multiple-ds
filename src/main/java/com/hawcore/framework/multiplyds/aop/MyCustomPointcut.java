package com.hawcore.framework.multiplyds.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//@Component

public class MyCustomPointcut extends StaticMethodMatcherPointcut {

    @Autowired
    private Environment ev;

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return aClass.getName().startsWith(ev.getProperty("multiple.datasource.base-service-package"));
    }

    public MyCustomPointcut() {
    }

}
