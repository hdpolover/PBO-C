/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

/**
 *
 * @author hendr
 */
public class Sesi_5_DemoPassByValue {
    public static void main(String[] args) {
        int bil1 = 3;
        int bil2 = 7;
        
        System.out.println("Sebelum memanggil method tukarBilangan:\n" +
        "------------------------------------------\n" +
                "Nilai bilangan1 adalah " + bil1 + "\n" + 
                "Nilai bilangan2 adalah " + bil2 + "\n");
        
        tukarBilangan(bil1, bil2);
        
        System.out.println("Setelah memanggil method tukarBilangan:\n" +
        "------------------------------------------\n" +
                "Nilai bilangan1 adalah " + bil1 + "\n" + 
                "Nilai bilangan2 adalah " + bil2 + "\n");
    }
    
    static void tukarBilangan(int a, int b) {
        System.out.println("Saat ini kendali program berada di " +
                "dalam method 'tukarBilangan'\n");
        System.out.println("Sebelum proses penukaran:\n" +
                "------------------------------\n" +
                "Nilai a adalah " + a + "\n" +
                "Nilai b adalah " + b + "\n");
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Kendali program masih di dalam method " +
                "'tukarBilangan'...\n");
        System.out.println("Setelah proses penukaran:\n" +
                "------------------------------\n" +
                "Nilai a adalah " + a + "\n" +
                "Nilai b adalah " + b + "\n");
        System.out.println("Kendali program keluar dari " + 
                "method 'tukarBilangan'\n");
    }
}
