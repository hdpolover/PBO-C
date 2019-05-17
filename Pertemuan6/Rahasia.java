/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author hendra
 */
public class Rahasia {
    static String kunci = "STIKI MALANG";
    static String kata = "";
    static int hasilKunci = 0;
    
    static String inputData() {
        kata = InputConsole.readString();
        return kata;
    }
    
    //fungsi untuk merubah kata ke ascii
    static int[] rubahKeAscii(String kata) {
        int panjang = kata.length();
        
        char[] karakter = new char[panjang];
        int[] ascii = new int[panjang];
        
        for (int i = 0; i < panjang; i++) {
            karakter[i] = kata.charAt(i);
        }
        
        for (int i = 0; i < panjang; i++) {
            ascii[i] = (int) karakter[i]; 
        }
        
        return ascii;
    }
    
    //fungsi untuk merubah kata kunci ke ascii sekaligus menghitung hasil akhirnya
    static double hasilKunci(int[] a) {
        double total = 0, bagi;
        for (int i = 0; i < a.length; i++) {
            total = total + a[i]; 
        }
        bagi = total / a.length;
        double b = Math.round(bagi);
        return b;
    }
    
    static int[] enkripsi() {
        int[] asciiInput = rubahKeAscii(kata);
        int lg = asciiInput.length;
        
        hasilKunci = (int) hasilKunci(rubahKeAscii(kunci));
        
        int[] hasilInputDanKunci = new int[lg];
        for (int i = 0; i < lg; i++) {
            hasilInputDanKunci[i] = asciiInput[i] + hasilKunci;
        }
        return hasilInputDanKunci;
    }
    
    static String hasilEnkripsi() {
        int[] h = enkripsi();
        
        char[] hasilDekripsi = new char[h.length];
        
        for (int i = 0; i < h.length; i++) {
            hasilDekripsi[i] = (char) h[i];
        }
        
        String hasilAkhir = "";
        for (int i = 0; i < h.length; i++) {
            hasilAkhir = hasilAkhir + hasilDekripsi[i];
        }
        return hasilAkhir;
    }
    
    static String dekripsi() {
        int[] dekrip = enkripsi();
        int[] hasilDekripsi = new int[dekrip.length];
        
        for (int i = 0; i < dekrip.length; i++) {
            hasilDekripsi[i] = dekrip[i] - hasilKunci;
        }
        
        char[] ha = new char[dekrip.length];
        
        for (int i = 0; i < dekrip.length; i++) {
            ha[i] = (char) hasilDekripsi[i];
        }
        
        String hasilAkhir = "";
        for (int i = 0; i < dekrip.length; i++) {
            hasilAkhir = hasilAkhir + ha[i];
        }
        return hasilAkhir;
    }
    
    public static void main(String[] args) {
        System.out.print("Masukan kata: ");
        inputData();
        
        System.out.println("Kata kunci: " + kunci);
        System.out.println("Hasil Enkripsi: " + hasilEnkripsi());
        System.out.println("Hasil Dekripsi: " + dekripsi());
    }
}
