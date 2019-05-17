/*
 * File : Tugas_1_Bintang6.java
 * Title : Tugas 1 Bintang 6
 * Deskripsi : Bintang soal nomor 6
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang6 {

    public static void main(String[] args) {
        System.out.println("*");
        for (int i = 0; i < 8; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //print baris paling bawah
        System.out.println("**********");
    }
}
