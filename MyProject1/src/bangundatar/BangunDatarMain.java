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
public class BangunDatarMain {
    public static void main(String[] args) {
       PersegiPanjang op1 = new PersegiPanjang();
       op1.panjang = 25;
       op1.lebar = 38;
       op1.hitungKeliling();
       op1.hitungLuas();
       
       System.out.println("Persegi A");
       Persegi per1 = new Persegi();
       per1.sisi = 10;
       per1.hitungKeliling();
       per1.hitungLuas();
       
       System.out.println("Persegi B");
       Persegi per2 = new Persegi();
       per2.sisi = 15;
       per2.hitungKeliling();
       per2.hitungLuas();
       
       System.out.println("Lingkaran X");
       Lingkaran lin1 = new Lingkaran();
       lin1.r = 25;
       lin1.hitungKeliling();
       lin1.hitungLuas();
       
       System.out.println("Lingkaran Y");
       Lingkaran lin2 = new Lingkaran();
       lin2.r = 37;
       lin2.hitungKeliling();
       lin2.hitungLuas();
    }
}
