/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Asus
 */
public class Rerata {
 
    ArrayList<Integer> dataBil = new ArrayList<Integer>();
    
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan bil bulat: ");
            dataBil.add(input.nextInt());
            System.out.println("Isi datalist: "+ this.dataBil);    
            input.nextLine();
            System.out.print("Input lagi (y/n): ");
            char answer = input.nextLine().charAt(0);
            if(answer == 'n') {
                break;
            }
        }
        
    }
    
    double hitungRerata(ArrayList<Integer> data) {
        double sum = 0;
        for(Integer item: data) {
            sum += item;
        }
        
        return sum/data.size();
    }
    
    void output() {
        System.out.println("----------------");
        System.out.println("Rerata data: " + this.hitungRerata(this.dataBil));
        System.out.println("Banyak data: " + this.dataBil.size());
        System.out.println("Data max   : " + Collections.max(this.dataBil));
        System.out.println("Data min   : " + Collections.min(this.dataBil));
    }
    
}
