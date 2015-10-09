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
		 //�õ�ע���bean��ʹ��java�ķ���ʵ�ֵ�	  
		 User u = ctx.getBean("user", User.class);	  
		 System.out.println(u.get());
	}
	
	@Test
	public void testaop() {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		          
		  //�õ�ע���bean
		 //����ʵ�����е���spring��װ�Ĵ�����
		 IStudent person = (IStudent)ctx.getBean("student");
		
		 person.addStudent("dragonaaaaa");
		  
	}
}
