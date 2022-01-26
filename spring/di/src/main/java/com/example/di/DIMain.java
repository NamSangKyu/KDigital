package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(DIContainer.class);
		Greeting g = ctx.getBean("greeter",Greeting.class);
		System.out.println(g.getId() + " " + g.getContent());
		
		Person p = ctx.getBean("person",Person.class);
		System.out.println(p.toString());
		Person s = ctx.getBean("person",Person.class);
		s.setAge(30);
		s.setName("김철수");
		System.out.println(p.toString());
	}

}
