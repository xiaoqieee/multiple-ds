package com.hawcore.framework.multiplyds.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = -100)
@Aspect
public class DataSourceSwitchAspect {

    private Logger logger = LoggerFactory.getLogger(DataSourceSwitchAspect.class);


    @Pointcut("execution(* com.hawcore.framework.multiplyds.service..*.*(..))")
    private void serviceAspect() {
    }
//
//    @Pointcut("execution(* com.hawcore.framework.multiplyds.service.db1..*.*(..))")
//    private void db1Aspect() {
//    }
//
//    @Pointcut("execution(* com.hawcore.framework.multiplyds.service.db1..*.*(..))")
//    private void db2Aspect() {
//    }
//
//    @Pointcut("execution(* com.hawcore.framework.multiplyds.service.db2..*.*(..))")
//    private void db3Aspect() {
//    }

    @Before("serviceAspect()")
    public void db1(JoinPoint point) {
        String className = point.getSignature().getDeclaringTypeName();
//        System.out.println(className);
        if (className.startsWith("com.hawcore.framework.multiplyds.service.db.impl")) {
//            logger.info("切换到db1 数据源...");
            DbContextHolder.setDbType("db");
        } else if (className.startsWith("com.hawcore.framework.multiplyds.service.db1.impl")) {
//            logger.info("切换到db2 数据源...");
            DbContextHolder.setDbType("db1");
        } else if (className.startsWith("com.hawcore.framework.multiplyds.service.db2.impl")) {
//            logger.info("切换到db3 数据源...");
            DbContextHolder.setDbType("db2");
        } else {
            throw new RuntimeException("包名不对。" + className);
        }

    }

    @After("serviceAspect()")
    public void reset() {
//        logger.info("回退数据源...");
        DbContextHolder.reback();
    }

//
//    @Before("db2Aspect()")
//    public void db2() {
//        logger.info("切换到db2 数据源...");
//        DbContextHolder.setDbType(DBTypeEnum.db2);
//    }
//
//    @Before("db3Aspect()")
//    public void db3() {
//        logger.info("切换到db3 数据源...");
//        DbContextHolder.setDbType(DBTypeEnum.db3);
//    }


}
