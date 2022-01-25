package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
//b
	public static void main(String[] args) {
	/*	Sport fs = new Footaball();
		fs.start();
		Sport bs = new Basketball();
		bs.start();
*/
		// Load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrive bean from the spring cont.
		Sport football = context.getBean("mySport", Sport.class);
		
		// Call the methods on the bean
		football.start();
		
		// Close the context
		context.close();
	}

}
