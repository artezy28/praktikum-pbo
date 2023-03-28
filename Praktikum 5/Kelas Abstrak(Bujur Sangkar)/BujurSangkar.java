/**
* File : BujurSangkar.java 25/Maret/2023
* Penulis : Majid Ilham Adhim
* Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
**/

public class BujurSangkar extends BangunDatar{
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}

/**
Kelas BujurSangkar mungkin akan menghasilkan error saat dicompile atau dijalankan jika tidak 
membuat implementasi metode abstrak yang ada pada kelas BangunDatar, karena kelas BujurSangkar 
merupakan turunan dari kelas BangunDatar yang memiliki metode abstrak yang harus 
diimplementasikan di kelas turunannya.

Metode abstrak pada kelas BangunDatar mewakili suatu tipe atau perilaku yang harus ada 
pada setiap turunan dari kelas BangunDatar, sehingga jika kelas BujurSangkar tidak 
mengimplementasikan metode abstrak tersebut, maka kelas BujurSangkar akan dianggap tidak 
lengkap atau tidak memiliki semua perilaku yang diharapkan dari turunan kelas BangunDatar.

Jika suatu kelas memiliki metode abstrak, maka kelas tersebut harus dideklarasikan 
sebagai kelas abstrak juga. Oleh karena itu, jika kelas BujurSangkar tidak mengimplementasikan metode 
abstrak pada kelas BangunDatar, maka kelas BujurSangkar juga harus dideklarasikan sebagai kelas abstrak.
**/