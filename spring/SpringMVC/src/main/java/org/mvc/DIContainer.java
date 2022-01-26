package org.mvc;

import org.mvc.config.DBManager;
import org.mvc.dao.StudentDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIContainer {
	@Bean
	public DBManager manager() {
		DBManager manager = new DBManager();
		return manager;
	}
	
	@Bean
	public StudentDAO dao() {
		StudentDAO dao = new StudentDAO(manager());
		return dao; 
	}
	
}
