package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
 
//ǰ��֪ͨ MethodBeforeAdvice
public   class  BeforeAdvice  implements  MethodBeforeAdvice {
	  
	         public  void  before(Method method,Object[] args, Object target)
	                   throws  Throwable {
	            
	           System.out.println( " ����BeforeAdvice���before����. " );
            
        }

		 
  } 