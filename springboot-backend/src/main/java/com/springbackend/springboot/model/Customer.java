package com.springbackend.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="preferredfood")
	private String preferredfood;
	
	public Customer() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPreferredfood() {
		return preferredfood;
	}

	public void setPreferredfood(String preferredfood) {
		this.preferredfood = preferredfood;
	}

	public Customer(String name, String gender, int age, String preferredfood) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredfood = preferredfood;
	}

	
	
	

}
