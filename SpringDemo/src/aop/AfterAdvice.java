package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//后置通知AfterReturningAdvice，在目标方法后面执行
public class AfterAdvice implements AfterReturningAdvice{
	    
	    public void afterReturning(Object returnValue ,Method method,
	                   Object[] args,Object target) throws Throwable{
	        System.out.println("这是AfterAdvice类的afterReturning方法.");
	    }
	      
	
	}