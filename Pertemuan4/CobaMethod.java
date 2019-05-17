/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author hendr
 */
public class CobaMethod {
    // static int a = 5, b = 2, c, d;

//    static void tambah() {
//        c = a + b;
//    }
//    
//    static void kali() {
//        d = c * b;
//    }
    static int tambah(int a, int b) {
        return a + b;
    }

    static int kali(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
//        tambah();
//        kali();
//        System.out.println(d);
        int a = 5;
        int b = 2;
        System.out.println(kali(tambah(a, b), b));
    }
}
