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
public class Lingkaran {
    public double r;
    
    public void hitungKeliling() {
        double kel = 3.14 * 2 * r;
        System.out.println("Keliling lingkaran adalah " + kel);
    }
    
    public void hitungLuas() {
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran adalah " + luas);
    }
}
