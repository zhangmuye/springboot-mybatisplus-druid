package com.mybatisplus.mybatisplus.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Aop控制类
 * 控制日志打印
 */
@Aspect
public class ConfigAop {
    public static final Logger logger =  LoggerFactory.getLogger(ConfigAop.class);

    /**
     * 定义一个切入点
     */
    @Pointcut(value = "execution(* com.mybatisplus.mybatisplus.mapper.*(..))")
    public void getLogger(){

    }

    /**
     * 环绕打印日志信息
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "getLogger()")
    public Object around(MethodInvocation joinPoint) throws Throwable {
        long startTime = getTime();
        logger.info("访问开始时间："+startTime);
        Object proceed = joinPoint.proceed();
        long endTime = getTime();
        logger.info("访问结束时间："+endTime);
        logger.info("访问返回总用时："+(endTime-startTime));
        return proceed;
    }

    public long getTime(){
        return System.currentTimeMillis();
    }


}
