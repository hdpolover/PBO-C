/*
 * File         : Sesi_2_DemoMethod.java
 * Title        : To change this template file, choose Tools | Templates
 * Deskripsi    : and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author hendr
 */
public class Sesi_2_DemoMethod {
    public static void main(String[] args) {
        System.out.println("\nPROGRAM DEMO METHOD");
        System.out.println("--------------------\n");
        
        //memanggil prosedur Salam
        salam();
        
        //memanggil fungsi hitung sekaligus memberi hasil penjumlahan
        System.out.println("Hasil 2 + 5 = " + hitung(2, 5));
    }
    
    static void salam() {
        System.out.println("Halo.");
    }
    
    static int hitung(int a, int b) {
        return a * b;
    }
}
