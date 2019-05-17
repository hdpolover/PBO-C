/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author hendr
 */
public class Sesi_5_DemoKonstruktor2 {

    public static void main(String[] args) {
        kampus kmp = new kampus();
        System.out.println(kmp.tampil());

        System.out.println("------------------------");

        kampus kmp2 = new kampus("Jl. Raya Tidar 100 Malang");
        System.out.println(kmp2.tampil());
        
        System.out.println("------------------------");

        kampus kmp3 = new kampus(2019);
        System.out.println(kmp3.tampil());
        
        System.out.println("------------------------");
        String hasil = "Kampusku adalah: " + kmp.namaPt
                + "\nAlamat kampus: " + kmp2.alamatPt
                + "\nUsia kampus: " + kmp3.usiaPt;
        System.out.println(hasil);
    }
}

class kampus {

    String namaPt, alamatPt;
    int usiaPt;

    public kampus() {
        this.namaPt = "STIKI";
    }

    public kampus(String alm) {
        this.alamatPt = alm;
    }
    
    public kampus(int tahun) {
        this.usiaPt = tahun - 1985;
    }

    String tampil() {
        String hasil;
        hasil = "Kampusku adalah: " + namaPt
                + "\nAlamat kampus: " + alamatPt
                + "\nUsia kampus: " + usiaPt;
        return hasil;
    }
}
