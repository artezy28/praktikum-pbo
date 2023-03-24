/**
* File : Kubus.java 15/Maret/2023
* Penulis : Majid Ilham Adhim
* Deskripsi : Representasi dasar dari objek Kubus,turunan kelas poligon
**/

package.org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
	return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas(){
        double sisi = permukaan.getPanjangSisi();
        return sisi*sisi;
    }
	
}
