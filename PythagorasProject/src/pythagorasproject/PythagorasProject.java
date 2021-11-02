/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

/**
 *
 * @author Asus
 */


public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int menu;
               
        Pythagoras x = new Pythagoras();
        Scanner input = new Scanner(System.in);
        
        
        while(true) {
            
            System.out.println("\nDaftar Pythagoras");
            System.out.println(
                    "1. Cek triple pythagoras\n" +
                    "2. Menentukan sisi miring segitiga\n" +
                    "3. Menentukan sisi siku-siku segitiga\n" +
                    "4. Exit");
            
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            
            switch(menu) {
                case 1:
                    System.out.print("Nilai a : ");
                    a = input.nextInt();
                    System.out.print("Nilai b : ");
                    b = input.nextInt();
                    System.out.print("Nilai c : ");
                    c = input.nextInt();                    
                    x.triple(a,b,c);
                    break;
                case 2:
                    System.out.print("Nilai a : ");
                    a = input.nextInt();
                    System.out.print("Nilai b : ");
                    b = input.nextInt();
                    double sismiring = x.hitungSisiMiring(a, b);
                    System.out.println("Nilai c : " +sismiring);
                    break;
                case 3:
                    System.out.print("Nilai a : ");
                    a = input.nextInt();
                    System.out.print("Nilai c : ");
                    c = input.nextInt();
                    double sissiku = x.hitungSisiSiku(a, c);
                    System.out.println("Nilai B yaitu " +sissiku);
                    break;
                case 4:
                    System.exit(0);
            }
        }          
    }   
}

