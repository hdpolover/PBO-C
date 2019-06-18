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
public class Tester {

    public static void main(String[] args) {

        Kucing garong = new Kucing();

        garong.setNama("Si Garong");
        garong.setWarna("Hitam");
        garong.setUmur(7);
        garong.setBerat(3);
        garong.setJenis("Anggorad");

        System.out.println("Nama: " + garong.getNama());
        if (garong.getUmur() > 0 && garong.getUmur() < 10) {
            System.out.println("Umur: " + garong.getUmur());
        }
        System.out.println("Jenis: " + garong.getJenis());

        garong.meong();
        garong.gigit();
    }

}
