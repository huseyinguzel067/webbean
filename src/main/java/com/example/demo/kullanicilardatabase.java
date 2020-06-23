package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "kullanicilar")
@Entity
public class kullanicilardatabase {
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Column(name="adi")
	private String adi;
	@Column(name="soyadi")
	private String soyadi;
	@Column(name="adres")
	private String adres;

	public String getAdi() {
		return adi;
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}

}
