/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author hendr
 */
public class NewClass {
    public static void main(String[] args) {
        int angka_sebelum = 0;
        int angka_sesudah = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print((j-1) + " ");
            }
            System.out.println("");
        }
    }
}
