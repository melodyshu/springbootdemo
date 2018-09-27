package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.StudentService;

@Configuration
public class AppConfig {
	@Bean
	public StudentService stuService() {
		return new StudentService();
	}
}
