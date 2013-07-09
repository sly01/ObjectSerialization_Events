package com.main;

import java.util.EventObject;

public class KaydetmeEventObject extends EventObject {

	private String isim;
	private String soyad;
	private int no;

	public KaydetmeEventObject(Object source, String isim, String soyad, int no) {
		super(source);
		this.isim = isim;
		this.soyad = soyad;
		this.no = no;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
