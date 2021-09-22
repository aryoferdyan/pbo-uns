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
public class Persegi {
    
    public int sisi;
    
    public void hitungKeliling() {
        int kel = sisi * 4;
        System.out.println("Keliling persegi adalah " + kel);
    }
    
    public void hitungLuas() {
        int luas = sisi * sisi;
        System.out.println("Luas perseg adalah " + luas);
    }
}
