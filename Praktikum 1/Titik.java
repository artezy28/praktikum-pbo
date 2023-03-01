/*
Titik.java 22/02/2023
Penulis : Majid Ilham Adhim
Deskripsi : Kelas yang berisi program  Titik
*/
class Titik{

	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	void setAbsis(double a){
		absis=a;
	}
	
	void setOrdinat(double a){
		ordinat=a;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}