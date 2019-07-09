/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

/**
 *
 * @author hendr
 */
interface Konstanta {
    double KONST_PI = 3.14;
    String KONST_SATUAN_LUAS = " cm. persegi ";
    String KONST_SATUAN_PANJANG = "cm.";
}

public class Demo_interface implements Konstanta {
    public static void main(String[] args) {
        System.out.println("PROGRAM DEMO INTERFACE");
        System.out.println("------------------------\n");
        double radius = 10;
        System.out.println("Radius Lingkaran: " + radius);
        System.out.println("Luas Lingkaran: " + (KONST_PI*radius*radius) + KONST_SATUAN_LUAS);
        System.out.println("Keliling Lingkaran: " + (2*KONST_PI*radius) + Konstanta.KONST_SATUAN_PANJANG);
    }
}
