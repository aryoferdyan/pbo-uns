/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Asus
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n;
        int x;
        Scanner inp = new Scanner(System.in);
        Random ran = new Random();
        n = ran.nextInt(101);
        System.out.println(n);
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!");
        while(true) {
            System.out.print("Masukkan Tebakan Anda: ");
            x = inp.nextInt();
            if(x == n){
                System.out.println("Yeee... Bilangan tebakan anda BENAR :-)");
                break;
            }else if(x < n){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
            }else if(x > n){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
            }
        }
        
    }
    
}
