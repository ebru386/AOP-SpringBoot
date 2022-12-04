package com.springBootAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AspectManager {
	@Pointcut("execution(* com.springBootAOP.api.controllers.*.*(..))")
    public void loggingPointCut(){}

    @Before("loggingPointCut()")
    public void before( JoinPoint joinPoint ){
        log.info("Before method called: "+joinPoint.getSignature());
    }
    @After("loggingPointCut()")
    public void after( JoinPoint joinPoint ){
        log.info("After method called: "+joinPoint.getSignature());
    }
    @Before("@annotation(com.springBootAOP.annotation.CustomAnnotation)")
    public void professionOperation(JoinPoint joinPoint){
        log.info("After method called for Profession Operation with Annotation: "+joinPoint.getSignature());
    }
    @After("@annotation(com.springBootAOP.annotation.CustomAnnotation)")
    public void lawyerOperation(JoinPoint joinPoint, Object bean){
        log.info("Annotation based before method called for Class: "+bean.getClass().getSimpleName()
                +" and Method: "+joinPoint.getSignature());
    }

}
