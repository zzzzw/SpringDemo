package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
 
//前置通知 MethodBeforeAdvice
public   class  BeforeAdvice  implements  MethodBeforeAdvice {
	  
	         public  void  before(Method method,Object[] args, Object target)
	                   throws  Throwable {
	            
	           System.out.println( " 这是BeforeAdvice类的before方法. " );
            
        }

		 
  } 