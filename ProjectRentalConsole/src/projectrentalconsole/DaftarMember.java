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
public class DaftarMember {
    String ID;
    String Nama;
    String Jenis;
    
    public DaftarMember(String x, String y, String z) {
        this.ID = x;
        this.Nama = y;
        this.Jenis = z;
    }
    
    void output() {
        System.out.println("ID Member               : " + this.ID);
        System.out.println("Nama Member             : " + this.Nama);
        System.out.println("Jenis Member            : " + this.Jenis);
        System.out.println();
    }
}
