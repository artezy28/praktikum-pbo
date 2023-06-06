/**
 Nama file	:LambdaHashMap.java
 Tanggal	:05 Juni 2023
 Penulis	:Majid Ilham Adhim / 24060121140169
 Deskripsi	:Implementasi lambda pada map, digunakan sebagai parameter pada method.
 **/
 import java.util.*;

public class LambdaHashmap{
    public static void main(String[] args){
        HashMap<String, String> mahasiswaMap = new HashMap<String, String>();
        mahasiswaMap.put("24060121140169", "Majid Ilham Adhim");


        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
} 