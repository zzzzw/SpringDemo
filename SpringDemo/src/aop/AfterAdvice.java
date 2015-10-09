package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//����֪ͨAfterReturningAdvice����Ŀ�귽������ִ��
public class AfterAdvice implements AfterReturningAdvice{
	    
	    public void afterReturning(Object returnValue ,Method method,
	                   Object[] args,Object target) throws Throwable{
	        System.out.println("����AfterAdvice���afterReturning����.");
	    }
	      
	
	}