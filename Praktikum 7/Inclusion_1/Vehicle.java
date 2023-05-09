/**
* File: Vehicle.java 03/05/2023
* Penulis: Majid Ilham Adhim
* Deskripsi : Program super class Vehicle pada Polimorfisme inclusion 1
*/
public class Vehicle{
	void calRent(int distance,float price){
		float fare = distance* price;
		System.out.println("Vehicle price = "+fare);
	}
}