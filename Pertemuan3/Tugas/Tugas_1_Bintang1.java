/*
 * File : Tugas_1_Bintang1.java
 * Title : Tugas 1 Bintang 1
 * Deskripsi : Bintang soal nomor 1
 */
package Pertemuan3.Tugas;

/**
 *
 * @author hendr
 */
public class Tugas_1_Bintang1 {

    public static void main(String[] args) {
        //for untuk baris bintang
        for (int i = 0; i < 5; i++) {
            //for untuk kolom bintang
            for (int y = 0; y < 5; y++) {
                System.out.print("*");
            }
            //baris baru
            System.out.println("");
        }
    }
}
