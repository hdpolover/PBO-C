/*
 * File : Tugas_1_Bintang4.java
 * Title : Tugas 1 Bintang 4
 * Deskripsi : Bintang soal nomor 4
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang4 {

    public static void main(String[] args) {
        for (int i = 0, j = 10; i < 5; i++, j -= 2) {
            //print bintang untuk baris awal
            if (i == 0) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
            } else { //print bintang selanjutnya
                for (int k = 0; k < j / 2; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < (10 - j); k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < j / 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
