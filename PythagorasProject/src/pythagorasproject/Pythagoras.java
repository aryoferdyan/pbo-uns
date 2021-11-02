/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Asus
 */
public class Pythagoras {
    
    void triple(int a, int b, int c) {
        String n;
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            n = "";
        } else {
            n = "BUKAN";
        }
            System.out.println("Segitiga abc "+n+" merupakan triple pythagoras");
    }
    
    void triple(double a, double b, double c) {
        String n;
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            n = "";
        } else {
            n = "BUKAN";
        }
            System.out.println("Segitiga abc "+n+" merupakan triple pythagoras");
    }
    
    double hitungSisiMiring(int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    
    double hitungSisiMiring(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }    
    
    
    double hitungSisiSiku(int a, int c){
        return Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
    }

    double hitungSisiSiku(double a, double c){
        return Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
    }


}
