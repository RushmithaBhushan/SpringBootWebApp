package com.example.springboot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sample {
	
	@Value("${spring.datasource.password}") 
	public String dbUsername;

	/*
	 * public String getDbUsername() { return dbUsername; }
	 * 
	 * public void setDbUsername(String dbUsername) { this.dbUsername = dbUsername;
	 * }
	 */

}
