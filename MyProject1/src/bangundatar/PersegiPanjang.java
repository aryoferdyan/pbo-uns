/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang tersebut adalah " + luas);
    }
    
    public void hitungKeliling() {
        int kel = 2*panjang + 2*lebar;
        System.out.println("Keliling persegi panjang tersebut adalah " + kel);
    }
    
}
