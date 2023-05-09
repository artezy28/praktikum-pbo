/**
* File: Pegawai.java 08/05/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program super class Pegawai pada Polimorfisme inclusion 2
*/
public class Pegawai{
	int gajiPokok = 5000000;
	String nama;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	public void tampilData(){
		System.out.println("Nama : "+ nama +" Gaji Pokok : "+ gajiPokok);
	}
}