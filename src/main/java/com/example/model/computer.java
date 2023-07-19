package com.example.model;

import jakarta.annotation.PreDestroy;

public class computer {

	private String brand;

	public computer() {
		super();
		System.out.println("No Arg- computer class.");
	}

	public computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("All Arg- computer class.");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("computer object destroed");
	}
	
}
