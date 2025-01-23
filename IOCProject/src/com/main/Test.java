package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
Student s=(Student)apc.getBean("d");
System.out.println(s);
}
}
