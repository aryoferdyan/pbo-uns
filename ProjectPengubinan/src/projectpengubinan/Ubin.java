/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Asus
 */
public class Ubin {
    int panjang;
    int lebar;
    
    int hitungLuas(){
        //Menggunakan class PersegiPanjang
        PersegiPanjang p = new PersegiPanjang();
        
        //panjang dan lebar diambil dari Class Ubin
        //p.panjang = this.panjang;
        //p.lebar = this.lebar;
        
        //hitung luas
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
