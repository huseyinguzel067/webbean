package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javassist.ClassClassPath;

@Configuration
public class AppConfig {
	
	@Bean
	public kullanicilar kullanicilar() {
		
		return new kullanicilar();
	}

}
