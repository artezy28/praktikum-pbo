/**
* File: AngkaSialS.java 29/Maret/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program penggunaan exception buatan sendiri
				Pengenalan klausa 'throw' dan 'throws'
**/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(12);
			as.cobaAngka(13);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}
/**
Ketika eksepsi terjadi pada panggilan as.cobaAngka(13), baris 12 pada AngkaSial.java 
tidak akan dieksekusi karena program melompat langsung ke throw new AngkaSialException();
Baris 21 pada AngkaSial.java akan dieksekusi karena setelah eksepsi terjadi, 
kontrol program melompat ke blok catch dan mengeksekusi perintah yang ada di dalamnya, termasuk baris 21.
**/