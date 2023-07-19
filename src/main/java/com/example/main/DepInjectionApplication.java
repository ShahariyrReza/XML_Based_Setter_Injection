package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.coder;

@SpringBootApplication
public class DepInjectionApplication {

	public static void main(String[] args) {
	 	ApplicationContext context = SpringApplication.run(DepInjectionApplication.class, args);
		
		coder c1 = (coder) context.getBean("");
	}

}
