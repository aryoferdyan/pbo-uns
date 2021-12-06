/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;
import mobil.*;

/**
 *
 * @author Asus
 */
public class ProjectMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\nA	Sedan	Solo – Kudus 	60 km/jam 110km");
        Sedan A = new Sedan();
        A.jarak     = 110;
        A.kecepatan = 60;
        A.tampilHasil();
    
        System.out.println("\nB	Sedan	Solo – Jakarta 	65 km/jam 538km");
        Sedan B = new Sedan();
        B.jarak     = 538;
        B.kecepatan = 65;
        B.tampilHasil();  

        System.out.println("\nC	SUV	Solo – Banten 	57 km/jam 662km");
        SUV C = new SUV();
        C.jarak     = 662;
        C.kecepatan = 57;
        C.tampilHasil();
        
        System.out.println("\nD	SUV	Solo – Bandung	62 km/jam 532km");
        SUV D = new SUV();
        D.jarak     = 532;
        D.kecepatan = 62;
        D.tampilHasil();
        
        System.out.println("\nE	MPV	Solo – Banyuwangi    64 km/jam 541km");
        MPV E = new MPV();
        E.jarak     = 541;
        E.kecepatan = 64;
        E.tampilHasil();
        
        System.out.println("\nF	MPV	Solo – Jember 	53 km/jam 433km");
        MPV F = new MPV();
        F.jarak     = 433;
        F.kecepatan = 53;
        F.tampilHasil();
        
          
    }
    
}
