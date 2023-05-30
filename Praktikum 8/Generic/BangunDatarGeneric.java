/**
* File: BangunDatarGeneric.java 17/05/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : kelas konstruksi generic untuk BangunDatar
**/
public class BangunDatarGeneric<T2 extends BangunDatar>{
	private T2 bangunDatar;
	
	public void set (T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T2 get (){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

/**
Mengganti karakter 'T' dengan karakter lain dalam kelas generik adalah 
sebuah cara untuk memberikan nama yang lebih deskriptif kepada parameter generik. 
Ini membantu dalam memberikan pemahaman yang lebih baik tentang tipe data 
yang digunakan dalam kelas tersebut. Selain itu, penggunaan karakter yang berbeda 
seperti T1, T2, atau T1234 juga membantu membedakan jika ada lebih dari satu parameter 
generik yang digunakan dalam kelas tersebut. Meskipun mengganti karakter 'T' dengan karakter 
lain seperti T1, T2, atau T1234 tidak mempengaruhi fungsionalitas kode secara langsung,
**/