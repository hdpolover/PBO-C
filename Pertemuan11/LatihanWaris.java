/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

/**
 *
 * @author hendr
 */
public class LatihanWaris {
    public static void main(String[] args) {
        Anak a = new Anak();
        
        int thnLahir = 1980;
        
        System.out.println("Usia: " + a.usia(thnLahir) + " tahun.");
    }
}

class Anak extends Bapak {
    int tahunSekarang = 2019;
    
    public int usia(int a) {
        return hitungUsia(tahunSekarang, a);
    }
}

class Bapak {
    public int hitungUsia(int a, int b) {
        return a - b;
    }
}
