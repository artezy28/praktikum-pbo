/**
* File : MKubus.java 15/Maret/2023
* Penulis : Majid Ilham Adhim
* Deskripsi : driver class untuk kubus
**/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		
		System.out.println("Panjang sisi Bujur Sangkar : " + bujurSangkar.getPanjangSisi() + "\n");
		System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus : " + kubus.hitungVolume());
	}
}