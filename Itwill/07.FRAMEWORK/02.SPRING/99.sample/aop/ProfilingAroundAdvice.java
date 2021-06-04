package com.itwill10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Component
@Aspect
public class ProfilingAroundAdvice {
	@Pointcut("execution(* com.itwill.user.UserServiceImplAnnotation.*(..))")
	public void profilingPointcut(){}
	@Around("profilingPointcut()")
	public Object aroundProfilingMethod(ProceedingJoinPoint pj )throws Throwable{
		StopWatch stopWatch=new StopWatch();
		stopWatch.start();
		Object returnObj=pj.proceed();
		stopWatch.stop();
		long duration=stopWatch.getTotalTimeMillis();
		String methodName=pj.getSignature().getName();
		String className=pj.getTarget().getClass().getName();
		String profilingLog=className+"."+ methodName+" took "+duration+ "ms";
		System.out.println("###[ProfilingAroundAdvice]:"+profilingLog);
		return returnObj;
		
	}
	
	
}	
