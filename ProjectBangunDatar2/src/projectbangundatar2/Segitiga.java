/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Asus
 */
public class Segitiga {
    
    static double hitungKuadrat(double x){
        return (x*x);
    }
    double hitungLuas(double x, double y){
        return(x*y/2);
    }
    
    double hitungKeliling(double x, double y){
        //x alas
        //y tinggi
        double sisiMiring = Math.sqrt(hitungKuadrat(0.5*x)+hitungKuadrat(y)); 
        return(2*sisiMiring+x);
    }
}
