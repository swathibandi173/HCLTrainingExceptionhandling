package com.swathi.hcltraining.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Student {
	@Id
	@GeneratedValue	
	private Long id;
	@Size(min=2)
	private String name;
	@Size(max=3)
	private Integer age;
	@Email
	private String email;
	private String branch;
	public Student() {
		super();
	}
	public Student(Long id, String name, Integer age, String email, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.branch = branch;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	

}
