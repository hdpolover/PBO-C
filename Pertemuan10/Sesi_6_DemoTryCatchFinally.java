/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

/**
 *
 * @author hendr
 */
class ExceptionPembagianNol extends Exception {
    public ExceptionPembagianNol (String msg) {
        super(msg);
    }
}
public class Sesi_6_DemoTryCatchFinally {
    public void pembagian() throws ExceptionPembagianNol {
        int num1 = 10;
        int num2 = 0;
        
        if (num2 == 0) throw new ExceptionPembagianNol(" ");
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("keluar dari method pembagian");
        
    }
    
    public static void main(String[] args) {
        try {
            new Sesi_6_DemoTryCatchFinally().pembagian();
        } catch (ExceptionPembagianNol e) {
            System.out.println("dalam blok main, " + 
                    "exception ditangani oleh " + e);
        } finally {
            System.out.println("Finally dalam method main");
        }
        System.out.println("Keluar dari method main");
    }
}
