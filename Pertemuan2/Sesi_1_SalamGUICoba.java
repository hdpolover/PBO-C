/*
 * File : Sesi_1_SalamGUICoba.java
 * Title : Salam GUI CO\oba
 * Deskripsi : Meemodifikasi listing seblumnya untuk mode grafis
 */
package Pertemuan2;

//mengimport kelas JOptionPane dari package javax.swing
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author hendr
 */
class Sesi_1_SalamGUICoba {

    //Main Method
    public static void main(String[] args) {
        //menampilkan pesan dengan message dialog dari kelas JOptionPane
        String data = "NRP\t: 171111022\n"
                + "Nama\t: Suhendra\n"
                + "Asal\t: Lampung\n"
                + "PT\t: STIKI Malang\n"
                + "\t  Jl. Raya Tidar 100";
        JOptionPane.showMessageDialog(null, new JTextArea(data), "My Profile", 1);
        System.exit(0); //keluar dari program
    }
}
