/**
* File: AngkaSialException.java 29/Maret/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Eksepsi buatan sendiri, menolak masuk 13!
**/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}