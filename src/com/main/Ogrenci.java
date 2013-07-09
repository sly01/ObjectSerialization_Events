package com.main;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String isim;
	private String soyisim;
	private int no;

	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String isim, String soyisim, int no) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.no = no;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return no +" "+isim+" "+soyisim;
	}
	
	
	
}
