/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bangundatar.*;
/**
 *
 * @author Asus
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.tampilHasil();
        
        Lingkaran l1 =  new Lingkaran();
        l1.jarijari = 7;
        l1.tampilHasil();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.lebar    = 5;
        pp.panjang  = 9;
        pp.tampilHasil();
    }

}
