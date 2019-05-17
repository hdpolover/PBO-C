/*
 * File : Tugas_1_Bintang2.java
 * Title : Tugas 1 Bintang 2
 * Deskripsi : Bintang soal nomor 2
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang2 {

    public static void main(String[] args) {
        //for untuk baris bintang
        for (int i = 0; i < 5; i++) {
            //for untuk kolom bintang
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //baris baru
            System.out.println("");
        }
    }
}
