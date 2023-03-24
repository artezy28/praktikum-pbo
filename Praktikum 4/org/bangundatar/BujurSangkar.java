/**
* File : BujurSangkar.java 15/Maret/2023
* Penulis : Majid Ilham Adhim
* Deskripsi : Representasi dasar dari objek Bujur Sangkar,turunan kelas poligon
**/
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangsisi;
	
	public BujurSangkar(double panjangsisi){
		this.panjangsisi = panjangsisi;
	}
	
	public double hitungLuas(){
		return panjangsisi*panjangsisi;
	}
	
	public double getPanjangSisi(){
		return panjangsisi;
	}
}
