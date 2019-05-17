/*
 * File : Sesi_1_SalamGUI.java
 * Title : Salam GUI
 * Deskripsi : Meemodifikasi listing seblumnya untuk mode grafis
 */
package Pertemuan2;

//mengimport kelas JOptionPane dari package javax.swing
import javax.swing.JOptionPane;
/**
 *
 * @author hendr
 */
class Sesi_1_SalamGUI {

    //Main Method
    public static void main(String[] args) {
        //menampilkan pesan dengan message dialog dari kelas JOptionPnae
        JOptionPane.showMessageDialog(null, "Belajar Java di STIKI", "Salam", 1);
        
        System.exit(0); //keluar dari program
    }
}
