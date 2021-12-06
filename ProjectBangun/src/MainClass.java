/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author Asus
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Persegi");
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.tampilHasil();
        System.out.println();
        
        System.out.println("Lingakaran");
        Lingkaran l1 =  new Lingkaran();
        l1.jarijari = 7;
        l1.tampilHasil();
        System.out.println();
        
        System.out.println("Persegi Panjang");
        PersegiPanjang pp = new PersegiPanjang();
        pp.lebar    = 5;
        pp.panjang  = 9;
        pp.tampilHasil();
        System.out.println();
        
        System.out.println("Balok");
        Balok bl = new Balok();
        bl.lebar   = 10;
        bl.panjang = 5;
        bl.tinggi  = 6;
        bl.tampilHasil();
        System.out.println();
        
        System.out.println("Bola");
        Bola b2 = new Bola();
        b2.jarijari = 9;
        b2.tampilHasil();
        System.out.println();
        
        System.out.println("Tabung");
        Tabung tb = new Tabung();
        tb.jarijari = 8;
        tb.tinggi   = 11;
        tb.tampilHasil();
    }

}
