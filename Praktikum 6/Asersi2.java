/**
* File: Asersi2.java 29/Maret/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program untuk demo asersi, yang akan menolak input 
				jari-jari lingkaran yang bernilai nol
**/

//clas Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = " + kelilingLingkaran);
	}
}

/**
Secara konsep, program Asersi2 di atas tidak sepenuhnya benar karena asersi yang digunakan untuk mengecek nilai jariJari tidak tepat. 
Karena menggunakan asersi assert(jariJari>0):"jari jari tidak boleh nol!!!"; untuk mengecek apakah jariJari bernilai lebih besar dari nol. 
Namun, pada program tersebut, jariJari diinisialisasi dengan nilai 0. 
Oleh karena itu, asersi tersebut akan menghasilkan eksepsi AssertionError dan program akan berhenti.
**/

