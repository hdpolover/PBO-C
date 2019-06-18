/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

/**
 *
 * @author hendr
 */
public class Kucing {

    private String nama;
    private String warna;
    private int umur;
    private int berat;
    private String jenis;
    private int poin;
    private String status;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 10) {
            System.out.println("Umur tidak boleh dari 10");
        } else {
            this.umur = umur;
        }
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("persia") || jenis.equalsIgnoreCase("anggora")) {
            this.jenis = jenis;
        } else {
            System.out.println("Maaf! Kucing kampung.");
            this.jenis = "Jenis kucing tidak dikenal.";
        }
    }

    void meong() {
        System.out.println("Metode meong");
    }

    void gigit() {
        System.out.println("Metode gigit");
    }
    
    public int getPoin() {
        if (umur > 0 && umur <= 5) {
            poin = 100;
        } else if (umur > 5 && umur <= 10) {
            poin = 300;
        }
        
        if (warna.equalsIgnoreCase("putih")) {
            poin += 500;
        } else {
            poin += 200;
        }
        
        if (jenis.equalsIgnoreCase("anggora")) {
            poin += 100;
        } else if (jenis.equalsIgnoreCase("persia")) {
            poin += 400;
        } 
        
        return poin;
    }
    
    public String getStatus() {
        if (poin >= 1000) {
            status = "Master Cat";
        } else if (poin < 1000) {
            status = "Yunior Cat";
        }
        
        return status;
    }
    
    void reputasi() {
        System.out.println("Nama\t: " + getNama());
        System.out.println("Umur\t: " + getUmur());
        System.out.println("Warna\t: " + getWarna());
        System.out.println("Berat\t: " + getBerat());
        System.out.println("Jenis\t: " + getJenis());
        System.out.println("Poin\t: " + getPoin());
        System.out.println("Status\t: " + getStatus());
    }
    
}
