/*
 * File : Tugas_1_Bintang7.java
 * Title : Tugas 1 Bintang 7
 * Deskripsi : Bintang soal nomor 7
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= 9; j++) {
                    if (j == i) {
                        System.out.print("*");
                    } else if ((i + j) == 10) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
