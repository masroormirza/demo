package com.digit.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

    	Hello h=(Hello) context.getBean("he");
    	h.sayHello();
    	
    	System.out.println(h.getName());
    	Calculator c=(Calculator) context.getBean("calc");
        c.add();
    }
}
