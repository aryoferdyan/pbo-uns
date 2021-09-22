/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Asus
 */
public class OperasiBilangan {
    
    // methods
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasli perkaliannya: " + hasil);
    } 
    
    public void hitungPembagian(){
        double blgPertama = bilPertama;
        double blgKedua = bilKedua;
        double hasil = blgPertama / blgKedua;
        System.out.println("Hasil pembagiannya adalah: " + hasil);
    }
    
    // atribut
    public int bilPertama;
    public int bilKedua;
    
}
