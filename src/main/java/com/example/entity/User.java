package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends AbstractBaseEntity {

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer age;

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

}
