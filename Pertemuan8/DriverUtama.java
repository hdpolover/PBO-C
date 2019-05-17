/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author hendr
 */
public class DriverUtama {
    public static void main(String[] args) {
        Mobil.namaMobil();
        
        Motor mo = new Motor();
        mo.namaMotor();
    }
}

class Mobil {
    public static void namaMobil() {
        System.out.println("Mobil");
    }
}

class Motor {
    public void namaMotor() {
        System.out.println("Motor");
    }
}
