package com.hawcore.framework.multiplyds.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(value = -100)
@Aspect
public class TestAspect {

    private Logger logger = LoggerFactory.getLogger(TestAspect.class);

    @Pointcut("execution(* com.hawcore.framework.multiplyds.service..*.*(..))")
    private void db1Aspect() {
    }

//    @Before("db1Aspect()")
    public void db1() {
        logger.info("测试方执行前置...");
    }

}
