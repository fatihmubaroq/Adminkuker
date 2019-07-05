package com.example.asus.admin.model;

import com.google.gson.annotations.SerializedName;

public class BeritaItem{

	@SerializedName("artikel")
	private String artikel;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("judul")
	private String judul;

	@SerializedName("id_berita")
	private String idBerita;

	@SerializedName("gambar")
	private String gambar;

	public void setArtikel(String artikel){
		this.artikel = artikel;
	}

	public String getArtikel(){
		return artikel;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public String getJudul(){
		return judul;
	}

	public void setIdBerita(String idBerita){
		this.idBerita = idBerita;
	}

	public String getIdBerita(){
		return idBerita;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}

	@Override
 	public String toString(){
		return 
			"BeritaItem{" + 
			"artikel = '" + artikel + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",judul = '" + judul + '\'' + 
			",id_berita = '" + idBerita + '\'' + 
			",gambar = '" + gambar + '\'' + 
			"}";
		}
}