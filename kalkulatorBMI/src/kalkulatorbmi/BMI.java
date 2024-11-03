/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorbmi;

/**
 *
 * @author donaf
 */
public class BMI {
    int BB;
    int TB; 
    
    public BMI(int TB, int BB) {
    this.BB = BB;
    this.TB = TB;  
}
    
public void hitungBMI(){   
    
    double tinggiMeter = TB / 100.0; // Konversi cm ke meter
    double hasil = BB / (tinggiMeter * tinggiMeter);
    System.out.println("Hasil kalkulasi dari Tinggi Badan " + TB + " dan berat badan " + BB);
    if (hasil < 18){
        System.out.println ("Adalah "+ hasil +" Berat Badan Kurang");    
    } else if (hasil >=18 && hasil<= 23){
        System.out.println ("Adalah "+ hasil +" Berat Badan Ideal");    
    } else if (hasil >=23 && hasil <=25) {
        System.out.println ("Adalah "+ hasil +" Kelebihan Berat Badan");    
    } else {
        System.out.println ("Adalah "+ hasil +" Kategori Obesitas 2");
    }   
}
}
