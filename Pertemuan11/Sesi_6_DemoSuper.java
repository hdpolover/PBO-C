/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

/**
 *
 * @author hendr
 */
public class Sesi_6_DemoSuper {
    public static void main(String[] args) {
        System.out.println("\nDemo 'super' PADA INHERITANCE");
        System.out.println("------------------------------\n");
        
        KelasAnak kA = new KelasAnak();
        kA.methodAnak();
        int a = 5;
        int b = 2;
        
        System.out.println("Hasil " + a + " + " + b + " = " + kA.jumlah(a, b));
    }
}

class KelasAnak extends KelasInduk {
    public KelasAnak() {
        super();
    }
    
    public void methodAnak() {
        super.methodInduk();
    }
}

class KelasInduk {
    public KelasInduk() {
        System.out.println("Ini adalah konstruktor induk.\n");
    }
    
    public int jumlah(int a, int b) {
        return a + b;
    }
    
    public void methodInduk() {
        System.out.println("Method ini dimiliki kelas Induk.\n");
    }
}
