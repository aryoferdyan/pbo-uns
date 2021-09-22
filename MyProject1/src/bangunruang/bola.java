/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Asus
 */
public class bola {
   
    public double r;
    
    public void hitungVol() {
        double vol = 4/3 * 3.14 * r * r * r;
        System.out.println("Volume bola adalah " + vol);
    }
 
    public void hitungLuasSelimut() {
        double luas = 4 * 3.14 * r * r;
        System.out.println("Luas selimut bola adalah " + luas);
    }
}
