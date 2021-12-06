/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Asus
 */
public abstract class Mobil {
    public double jarak;
    public double kecepatan;
    public abstract double hitungBensin();
    
    public double hitungWaktu() {
        double waktu =  this.jarak / this.kecepatan;
        return waktu;
    }
    
    public void tampilHasil(){
        System.out.println("Bahan bakar minimal yang diperlukan: " + this.hitungBensin() +" liter");
        System.out.println("Waktu tempuhnya adalah " + this.hitungWaktu() + " jam");
    }
}
