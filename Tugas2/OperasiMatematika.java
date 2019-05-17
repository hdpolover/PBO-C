/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author hendr
 */
public class OperasiMatematika {

    public static String genapAtauGanjil(int a) {
        String hasil = "";
        if (a % 2 == 0) {
            hasil = " Genap";
        } else {
            hasil = " Ganjil";
        }
        return hasil;
    }

    public static String prima(int a) {
        boolean prima = false;
        String hasil = "";
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                prima = true;
                break;
            }
        }

        if (!prima) {
            hasil = " Bilangan prima";
        } else {
            hasil = " Bukan bilangan prima";
        }
        return hasil;
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(int a, int b) {
        return a / b;
    }

    public static int pangkat(int a, int b) {
        int hasil = a;
        for (int i = 1; i < b; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public static String bintang(int a) {
        String bintang = "";
        for (int i = 0; i < a; i++) {
            bintang = bintang + "*";
        }
        return bintang;
    }

}
