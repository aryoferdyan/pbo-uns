/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;
import java.util.Scanner;
//import data.*;
/**
 *
 * @author Asus
 */
public class ProjectDataKaryawan {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // intansiasi object 
        DataKaryawan n = new DataKaryawan();
        // diberi data karyawan default, untuk contoh saja
        n.tambahData(new Karyawan("M001","Bambang Sujatmika ","Surakarta","1945-08-17","A","1","2"));
        n.tambahData(new Karyawan("M002","Rahmat Tri Susilo ","Jakarta","1945-08-18","B","1","0"));
        n.tambahData(new Karyawan("M003","Joko Nur          ","Long Angeles","1998-05-29","C","0","0"));
        n.tambahData(new Karyawan("M004","Joko Nur Rahmat   ","Long Angeles","1998-05-29","C","1","11"));
        while(true){
                       
            System.out.println("==================================");
            System.out.println( "MENU UTAMA - MANAGEMENT KARYAWAN");
            System.out.println("----------------------------------");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            
            Scanner input = new Scanner( System.in );
            System.out.print("Menu Pilihan  : ");
            int mainmenu = input.nextInt();
            
            switch(mainmenu){
                case 1 : 
                    while(true ){
                        System.out.println("==================");
                        System.out.println(" Menu Tambah Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan  : ");
                        String kode = input.nextLine();
                        System.out.print("Masukan Nama Karyawan  : ");
                        String nama = input.nextLine();
                        System.out.print("Masukan Alamat         : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukan Tanggal Lahir  :");
                        String tanggal = input.nextLine();
                        System.out.print("Masukan Golongan       : ");
                        String golongan = input.nextLine();
                        System.out.print("Masukan Status Menikah : ");
                        String status = input.nextLine();
                        String anak;
                        if( "1".equals(status) ){
                            System.out.print("Jumlah Anak            : ");
                            anak = input.nextLine();
                        } else {
                            anak = "0";
                        }
                        
                        Karyawan karyawan = new Karyawan(kode,nama+"        ",alamat,tanggal,golongan,status,anak);
                        n.tambahData(karyawan);
      
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Tambah data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_tambah = input.nextInt();
                        if(submenu_tambah != 2 ){
                            break;
                        }
                        
                        
                    }
                
                    break;
                
                case 2 : 
                    while( true) {
                        System.out.println("==================");
                        System.out.println(" Menu Hapus Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan kode karyawan yg ingin dihapus : ");
                        String kode_karyawan = input.nextLine();
                        
                        n.hapusData(kode_karyawan);
                        
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Hapus data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_hapus = input.nextInt();
                        if( submenu_hapus != 2 ){
                            break;
                        }
                        
                    }
                    break;
                
                case 3 :                     
                    while(true){
                        // input 
                        System.out.println("==================");
                        System.out.println(" Menu Cari Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan untuk dicari : "+"");
                        
                        String kode= input.nextLine();

                        n.cariData(kode);

                        System.out.println("");

                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Cari data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int submenu_cari = input.nextInt();
                        if( submenu_cari != 2 ){
                            break;
                        } 
                    }
                    break;
                
                case 4 : 
                    
                    n.lihatData();
                        
                    System.out.println("");
                        
                    input.nextLine();

                    System.out.println("Pilih Submenu : ");
                    System.out.println("1. Kembali ke menu utama");
                    System.out.println("");
                    System.out.print("Menu Pilihan : ");

                    input.nextInt();
                    break;
                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println(" !input salah");
                
            }   
            
        }
    }
    
}


