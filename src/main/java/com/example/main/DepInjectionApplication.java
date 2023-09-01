package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.model.coder;
import com.example.model.computer;

@SpringBootApplication
@ImportResource ({"classpath:beanConfig.xml"})
public class DepInjectionApplication {

	public static void main(String[] args) {
	 	ApplicationContext context = SpringApplication.run(DepInjectionApplication.class, args);
		
		coder c1 = (coder) context.getBean("coder1");
		System.out.println(c1.getName());
		System.out.println(c1.getComputer().getBrand());
		System.out.println(c1.getLanguage());
	}

}
