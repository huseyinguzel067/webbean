package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javassist.ClassClassPath;

@RestController
public class controller {
@Autowired

JdbcTemplate jdbc;
@RequestMapping("/insert")
public String index() {
	jdbc.execute("insert into kullanicilar(adi,soyadi,adres) values('huseying','guzel',10);");
	return "data inserted Successfullösfdmkö";
}

	
}
