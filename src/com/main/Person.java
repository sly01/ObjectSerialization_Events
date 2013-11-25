package com.main;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private int no;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String surname, int no) {
		super();
		this.name = name;
		this.surname = surname;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return no +" "+name+" "+surname;
	}
	
	
	
}
