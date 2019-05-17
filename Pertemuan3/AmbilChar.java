/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author hendr
 */
public class AmbilChar {

    public static void main(String[] args) {
        String kata = " Selamat Datang di Malang";
        String ambilAwal, ambilAkhir;
        int panjang = kata.length();
        
        System.out.println(kata);
        
        for (int i = 1; i <= panjang; i++) {
            ambilAwal = kata.substring(0, kata.length() - 1);
            ambilAkhir = kata.substring(kata.length() - 1);
            
            kata = ambilAkhir + ambilAwal;
            System.out.println(kata);
        }

//        char huruf = kata.charAt(kata.length() - 1);
//        System.out.println(huruf);
//        System.out.println(kata.charAt(4));
    }
}
