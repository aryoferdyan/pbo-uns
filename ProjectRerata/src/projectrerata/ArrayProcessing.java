/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class ArrayProcessing {
    
    int[] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data n: ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output(){
        System.out.println("Rerata         : "+this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimal : "+this.cariMax(this.dataBil));
        System.out.println("Nilai Minimal  : "+this.cariMin(this.dataBil));
        System.out.println("Data diurutkan : "+this.urutkan(this.dataBil));
//      System.out.println(Arrays.toString(this.dataBil));
    }
    
    int cariMax(int[] data){
        int max = data[0];
        for(int i=1; i < this.n;i++){
            if(data[i] > max){
              max = data[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i=1; i < this.n; i++){
          if(data[i] < min){
            min = data[i];
          }
        }
        return min;
    }
    
    String urutkan(int[] data){   
        int[] sortdata = new int[this.n];
        int temp = 0;  
        for(int i=0; i < this.n; i++){  
            for(int a=1; a < (this.n-i); a++){  
                if(data[a-1] > data[a]){  
                    temp = data[a-1];  
                    data[a-1] = data[a];  
                    data[a] = temp;  
                    }                            
                }  
        }  
        for(int i=0; i < this.n; i++){ 
            sortdata[i] = data[i];
        }
        
        return Arrays.toString(sortdata);
    }  
}
