package com.hawcore.framework.multiplyds.aop;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Test {
    public static void main(String[] args) {
        TestService testService = new TestService();
        TestService proxyService;

        Pointcut pc = new SimpleDynamicPointcut();
        Advice advice = new MyMethodBeforeAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pc, advice);

        ProxyFactory factory = new ProxyFactory();
        factory.addAdvisor(advisor);
        factory.setTarget(testService);
        proxyService = (TestService) factory.getProxy();
        proxyService.test();
    }
}
