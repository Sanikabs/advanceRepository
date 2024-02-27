package com.ty;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Profile {

	private String name;
	private int age;
	@EmbeddedId
	private AccountId id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AccountId getId() {
		return id;
	}

	public void setId(AccountId id) {
		this.id = id;
	}
	
}
