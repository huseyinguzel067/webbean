package com.example.demo;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.Query;

public class kullanicilarControler {


	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		kullanicilar kullanicilar =ctx.getBean(kullanicilar.class);
		kullanicilar.setAdi("huseyin");
		kullanicilar.getAdi();
		
	
	
		
	}
}
