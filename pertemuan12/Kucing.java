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

    void meong() {
        System.out.println("Metode meong");
    }
    
    void gigit() {
        System.out.println("Metode gigit");
    }
}