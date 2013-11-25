package com.main;

import java.util.EventObject;

public class SavingEventObject extends EventObject {

	private String name;
	private String surname;
	private int no;

	public SavingEventObject(Object source, String name, String surname, int no) {
		super(source);
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

}
