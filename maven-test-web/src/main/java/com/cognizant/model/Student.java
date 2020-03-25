package com.cognizant.model;

public class Student {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	public Student(String id2) {
		super();
		this.id=id2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

	
}
