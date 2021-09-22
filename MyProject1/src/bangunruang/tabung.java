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
public class tabung {
    
    public double r;
    public double t;
    
    public void hitungVolume() {
        double vol = 3.14 * r * r * t;
        System.out.println("Volume tabung adalah " + vol);
    }
    
    public void hitungLuasSelimut() {
        double luas = 3.14 * 2 * r * t;
        System.out.println("Luas selimut tabung adalah " + luas);
    }
}
