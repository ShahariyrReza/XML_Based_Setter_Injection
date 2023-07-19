package com.example.model;

import jakarta.annotation.PreDestroy;

public class coder {
	private int id;
	private String name;
	private String language;
	private computer computer;

	// Make a no arguments constructor
	public coder() {
		super();
		System.out.println("No Arg- coder class.");
	}

	// All arguments constructor
	public coder(int id, String name, String language, computer computer) {

		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.computer = computer;
		System.out.println("All Arg- coder class.");
	}

	// Setter and Getter Method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public computer getComputer() {
		return computer;
	}

	public void setComputer(computer computer) {
		this.computer = computer;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("coder object destroed");
	}

}
