package com.gproject.FirstPorject.entities;

public class User {
	private Long id;
	private String name;
	private String email;

	private Department departmant;
	
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartmant() {
		return departmant;
	}

	public void setDepartmant(Department departmant) {
		this.departmant = departmant;
	}
	
}
