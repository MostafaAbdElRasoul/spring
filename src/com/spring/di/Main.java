package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from the spring cont.
		UserInterface user = context.getBean("user", User.class);

		// Call the methods on the bean
		user.getPerson();
		System.out.println(user.getTeam()+" "+user.getEmail());
		// Retrieve bean from the spring cont.
		
		//PersonInterface person = context.getBean("person", Person.class);

		// Call the methods on the bean
		//person.begin();

		// Close the context
		context.close();

	}

}
