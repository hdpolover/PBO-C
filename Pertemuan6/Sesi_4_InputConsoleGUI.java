/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import javax.swing.JOptionPane;

/**
 *
 * @author hendr
 */
public class Sesi_4_InputConsoleGUI {

    public static void main(String[] args) {
        String namaSiswa, alamatAsal;
        
        System.out.println("Program DEMO INPUT CONSOLE & GUI");
        System.out.println("---------------------------------");
        
        namaSiswa = JOptionPane.showInputDialog(null, "Masukan nama siswa: ");
        System.out.print("Masukan alamat asal: ");
        alamatAsal = InputConsole.readString();
        
        JOptionPane.showMessageDialog(null, "Nama siswa: " + namaSiswa
                + "\nAlamat asal: " + alamatAsal, "Hasil", 1);
        System.exit(0);
    }
}
