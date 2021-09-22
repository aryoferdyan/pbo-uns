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
public class kerucut {
    
    public double r;
    public double t;
    public double s;
    
    public void hitungVol() {
        double vol = (1/3) * 3.14 * r * r * t;
        System.out.println("Volume kerucut adalah " + vol);
    }
    
    public void hitungLuasSelimut() {
        double luas = 3.14 * r * Math.sqrt(t*t+r*r);
        System.out.println("Luas selimut kerucut adalah " + luas);     
    }
}
