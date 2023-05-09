/**
* File: Programmer.java 08/05/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program subclass Manajer pada Polimorfisme inclusion 2
*/
public class Programmer extends Pegawai{
	int bonus = 450000;
	public Programmer(String nama){
		setNama(nama);
	}
	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus : "+bonus);
	}

}
