/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Asus
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persegi s = new Persegi();
        int luasPersegi = s.hitungLuas(42);
        
        Lingkaran r = new Lingkaran();
        //luas setengah lingakran
        double luasSetengahLingkaran = r.hitungLuas(21)/2;
       
        double luasKeseluruhan = 4*luasSetengahLingkaran + luasPersegi;
        System.out.println("Luas bangun datar pada project 1 tersebut : " + luasKeseluruhan);
    
        Lingkaran x = new Lingkaran();
        double luasX = x.hitungLuas(14)/2;
        
        Lingkaran y = new Lingkaran();
        // 2 kali setengah lingkaran 
        double luasY = y.hitungLuas(7);
        
        double luasXY = luasX - luasY;
        System.out.println("Luas bangun datar pada project 2 tersebut : " + luasXY);
    }
    
}
