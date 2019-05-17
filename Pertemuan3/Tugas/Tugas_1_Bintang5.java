/*
 * File : Tugas_1_Bintang5.java
 * Title : Tugas 1 Bintang 5
 * Deskripsi : Bintang soal nomor 5
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang5 {

    public static void main(String[] args) {
        //bintang bagian atas
        for (int i = 0, j = 10; i < 5; i++, j -= 2) {
            if (i == 0) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
            } else {
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
        //bintang bagian bawah
        for (int i = 0, j = 2; i < 5; i++, j += 2) {
            if (i == 5) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
            } else {
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
