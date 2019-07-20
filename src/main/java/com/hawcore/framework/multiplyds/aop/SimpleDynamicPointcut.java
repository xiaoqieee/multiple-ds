package com.hawcore.framework.multiplyds.aop;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        return aClass.getName().startsWith("com.hawcore.framework.multiplyds.aop");
    }
}
