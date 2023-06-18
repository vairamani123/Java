package com.dbconnection.dedalus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyConnectionMainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DbConnection.xml");
		
		MyDbConnection dao = (MyDbConnection) context.getBean("dao");
		dao.getMyConnection();
		dao.toString();
		
	}

}
