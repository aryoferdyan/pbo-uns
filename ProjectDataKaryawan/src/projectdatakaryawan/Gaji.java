/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;

/**
 *
 * @author Asus
 */
public interface Gaji {
    void print();
    Double gajiPokok(String n);
    Double tunjMenikah(String x,String y);
    Double tunjPegawai(int x, String y);
    Double tunjAnak(String x, String y);
        
}
