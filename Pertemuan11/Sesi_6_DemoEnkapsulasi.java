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
public class Sesi_6_DemoEnkapsulasi {
    public static void main(String[] args) {
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        
        System.out.println("\nDEMO ENKAPSULASI");
        System.out.println("------------------\n");
        
        HitungGaji tony = new HitungGaji();
        tony.setGaji(2500000);
        tony.hitungGaji();
        
        System.out.println("Informasi Gaji Pegawai");
        System.out.println("\nBesar Gaji kotor: " + digitPresisi.format(tony.getGajiKotor()));
        System.out.println("Besar gaji yang dibawa pulang: " + digitPresisi.format(tony.getGajiBersih()));
    }
}

class HitungGaji {
    private double gajiKotor, gajiSetelahPajak;
    public double gajiBersih;
    private double potongan = 75000.0;
    
    public void setGaji(double gaji) {
        gajiKotor = gaji;
    }
    
    public void hitungGaji() {
        gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajiSetelahPajak - potongan;
    }
    
    public double getGajiKotor() {
        return gajiKotor;
    }
    
    public double getGajiBersih() {
        return gajiBersih;
    }
}