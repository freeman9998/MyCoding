package com.itwill.user.controller;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
//@Component
//@Aspect
//@EnableAspectJAutoProxy //<aop:aspectj-autoproxy/>
public class LoginCheckAdvice {
	@Pointcut("execution(* user_view(..))||"+
			  "execution(* user_list(..))||"+
			  "execution(* user_modify_form(..))||"+
			  "execution(* user_modify_action(..))||"+
			  "execution(* user_remove_action(..))||"+
			  "execution(* user_modify_form_get(..))||"+
			  "execution(* user_modify_form_post(..))||"+
			  "execution(* user_logout_action(..))")
	public void user_login_check_pointcut() {}
	
	@Around("user_login_check_pointcut()")
	public Object login_check(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("****************<<aop>> login check**********************");
		HttpSession session = 
				((ServletRequestAttributes)(RequestContextHolder.currentRequestAttributes())).getRequest().getSession();
		Object result=null;
		if(session.getAttribute("sUserId")==null) {
			return "redirect:user_main";
		}else {
			result = pjp.proceed();
		}
		return result;
		
	}
	
}
