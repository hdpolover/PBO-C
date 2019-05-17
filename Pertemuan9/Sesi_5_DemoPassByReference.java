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
public class Sesi_5_DemoPassByReference {
    public static void main(String[] args) {
        int[] arrBil = {7, 0, 5, 0, 2, 0, 0, 5};
        
        Sesi_5_DemoPassByReference pbr = new Sesi_5_DemoPassByReference();
        int jumlahNol;
        
        System.out.print("Array bilangan: [");
        for (int i = 0; i < arrBil.length; i++) {
            System.out.print(arrBil[i] + " ");
        }
        System.out.println("]");
        
        jumlahNol = pbr.tukar(arrBil);
        System.out.println("\nJumlah elemen '0' = " + jumlahNol);
        System.out.print("\nArray bilangan yang baru: [");
        for (int i = 0; i < arrBil.length; i++) {
            System.out.print(arrBil[i] + " ");
        }
        System.out.println("]");
    }
    
    int tukar(int[] varArray) {
        int jumlah = 0;
        
        System.out.println("\nMethod menukar '0' menjadi '1' ");
        System.out.println("-----------------------");
        for (int i = 0; i < varArray.length; i++) {
            if (varArray[i] == 0) {
                jumlah++;
                System.out.println("Menukar elemen pada indeks: " + i);
                varArray[i] = 1;
            }
        }
        return jumlah;
    }
}
