package com.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIContainer {
	@Bean
	public Greeting greeter() {
		Greeting g = new Greeting(1, "test");
		return g;
	}
	
	@Bean
	public Person person() {
		Person p = new Person("홍길동", 20);
		return p;
	}
}
