/**
* File: Manajer.java 08/05/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program subclass Manajer pada Polimorfisme inclusion 2
*/
public class Manajer extends Pegawai{
	int tunjangan = 7000000;
	public Manajer(String nama){
		setNama(nama);
	}
	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan : "+tunjangan);
	}

}