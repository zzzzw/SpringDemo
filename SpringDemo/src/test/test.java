package test;
import ioc.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.IStudent;



public class test {
	
	@Test
	public void testioc() {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		          
		 //得到注入的bean，使用java的反射实现的	  
		 User u = ctx.getBean("user", User.class);	  
		 System.out.println(u.get());
	}
	
	@Test
	public void testaop() {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		          
		  //得到注入的bean
		 //这里实际运行的是spring包装的代理类
		 IStudent person = (IStudent)ctx.getBean("student");
		
		 person.addStudent("dragonaaaaa");
		  
	}
}
