package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class kullanicilarControler {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		kullanicilar kullanicilar =ctx.getBean(kullanicilar.class);
		kullanicilar.setAdi("huseyin");
		kullanicilar.getAdi();
	}
}
