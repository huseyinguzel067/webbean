package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table
@Entity(name = "kullanicilar")
public class kullanicilar {
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void getAdi() {
		//return adi;
		System.out.println(adi);
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	private String adi;
	private String soyadi;
	private String adress;

}
