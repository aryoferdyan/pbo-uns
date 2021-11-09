/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArrrayList {

    ArrayList<String> dataBil = new ArrayList<String>();

    void input() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Menu Data ArrayList : "
                    + "\n1. Tambah data "
                    + "\n2. Cari Data "
                    + "\n3. Hapus Data "
                    + "\n4. Tampil Data "
                    + "\n5. Keluar "
                    + "\nPilih nomor berapa : ");
            int n = input.nextInt();

            if (n == 1) {
                System.out.print("Masukkan data string: ");
                input.nextLine();
                this.dataBil.add(input.nextLine());
                System.out.println("Daftar string dalam array list: "+ this.dataBil);
                input.nextLine();

            } else if (n == 2) {
                System.out.print("String yang mau dicari: ");
                input.nextLine();
                String find = input.nextLine();
                int index = this.dataBil.indexOf(find);
                if (index >= 0) {
                    System.out.println("String '"+ find +"' ada di index ke-"+ index +" di dalam data");
                    input.nextLine();
                } else {
                    System.out.println("String ‘"+ find +"’ tidak ada dalam data");
                    input.nextLine();
                }
                
            } else if (n == 3) {
                System.out.print("String yang mau dihapus: ");
                input.nextLine();
                String find = input.nextLine();
                int indexDelete = this.dataBil.indexOf(find);
                if (indexDelete >= 0) {
                    this.dataBil.remove(indexDelete);
                    System.out.println("String '"+ find +"' sudah dihapus di dalam data");
                } else {
                    System.out.println("String ‘"+ find +"’ tidak ada dalam data");
                }
                System.out.println("Daftar string dalam array list: "+this.dataBil);
                input.nextLine();

            } else if (n == 4) {
                input.nextLine();
                System.out.println("Daftar string dalam array list: "+this.dataBil);
                input.nextLine();
               
            } else {
                System.exit(0);
            }
        }

    }
}
