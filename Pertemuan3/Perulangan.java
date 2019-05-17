/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author hendr
 */
public class Perulangan {

    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }
        
        System.out.println("----------------------");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print(x);
            }
            System.out.println("");
        }
        
        System.out.println("---------------------");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print(y);
            }
            System.out.println("");
        }
        
        System.out.println("---------------------");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(x);
            }
            System.out.println("");
        }
        
        System.out.println("---------------------");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
