/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Asus
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Tipe data integer akan di handle dengan method yang sama dengan double
        
        //persegipanjang
        System.out.println("Persegi Panjang");
        PersegiPanjang x = new PersegiPanjang();
        System.out.println("Luas persegi panjang : " + x.hitungLuas(7,5));
        System.out.println("Keliling persegi panjang : " + x.hitungKeliling(7,5));
        System.out.println("Luas persegi panjang : " + x.hitungLuas(3.6,8));
        System.out.println("Keliling persegi panjang : " + x.hitungKeliling(3.6,8));
        System.out.println("Luas persegi panjang : " + x.hitungLuas(6,8.3));
        System.out.println("Keliling persegi panjang : " + x.hitungKeliling(6,8.3));
        System.out.println("Luas persegi panjang : " + x.hitungLuas(5.6,8.8));
        System.out.println("Keliling persegi panjang : " + x.hitungKeliling(5.6,8.8));
        
        //Persegi
        System.out.println();
        System.out.println("Persegi");
        Persegi y =  new Persegi();
        System.out.println("Luas persegi : "+ y.hitungLuas(4.5));
        System.out.println("Keliling persegi : "+ y.hitungKeliling(4.5));
        System.out.println("Luas persegi : "+ y.hitungLuas(7));
        System.out.println("keliling persegi : "+ y.hitungKeliling(7));
        
        //Lingkaran
        System.out.println();
        System.out.println("Lingkaran");
        Lingkaran n = new Lingkaran();
        System.out.println("Luas lingakaran : "+ n.hitungLuas(5));
        System.out.println("Keliling lingakran : "+ n.hitungKeliling(5));
        System.out.println("Luas lingakaran : "+ n.hitungLuas(7.4));
        System.out.println("Keliling lingakran : "+ n.hitungKeliling(7.4));
        
        //segitiga
        System.out.println();
        System.out.println("Segitiga");
        Segitiga z = new Segitiga();
        System.out.println("Luas Segitga : "+ z.hitungLuas(8,10));
        System.out.println("Keliling Segitiga : "+ z.hitungKeliling(8,10));
        System.out.println("Luas Segitga : "+ z.hitungLuas(8,11.5));
        System.out.println("Keliling Segitiga : "+ z.hitungKeliling(8,11.5));
        System.out.println("Luas Segitga : "+ z.hitungLuas(12.2,9));
        System.out.println("Keliling Segitiga : "+ z.hitungKeliling(12.2,9));
        System.out.println("Luas Segitga : "+ z.hitungLuas(13.9,20.7));
        System.out.println("Keliling Segitiga : "+ z.hitungKeliling(13.9,20.7));
    }
    
}
