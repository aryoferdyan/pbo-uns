/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author Asus
 */
public class Silver extends Member {
    
    void inputSilver(DaftarMember x){
        this.Silver(x);
    }
    
    private void Silver(DaftarMember x) {
        super.member = x;
        this.biaya = 25000;
        this.diskon = 1;
        this.poin = 1;
        super.input();
        this.hitungTotal();
        this.output();
    }
    
    public void hitungTotal() {
        this.poin *= lama;
        this.totalBiaya  = this.biaya * this.lama;
        int diskon       = this.totalBiaya * this.diskon/100;
        this.totalBiaya -= diskon;
    }
    
    public void output() {
        System.out.println("Total Sewa		: Rp " + this.totalBiaya);
        System.out.println("Jumlah Poin		: " + this.poin);
    }
}
