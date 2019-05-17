/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author hendr
 */
public class Coba_Grade {
    public static void main(String[] args) {
        System.out.println("Program Grade");
        System.out.println("-------------\n");
        
        //inisialisasi variabel
        double nilai;
        char grade = ' ';
        String hadiah = "";
        
        //assign nilai
        nilai = 0;
        
        //kondisi grade
       if (nilai >= 60) {
           System.out.println("Anda lulus.");
           if ( nilai <= 75) {
               grade = 'C';
           } else if (nilai <= 85) {
               grade = 'B';
           } else {
               grade = 'A';
           }
       } else {
           System.out.println("Anda tidak lulus.");
            if (nilai >= 40) {
               grade = 'D';
           } else {
               grade = 'E';
           }
       }
       System.out.println("Grade\t: " + grade);
       
       //kondisi hadiah
       if (nilai >= 80) {
           hadiah = "Smartphone";
       } else if (nilai >= 65) {
           hadiah = "USB";
       } else {
           hadiah = "Kartu ucapan";
       }
        System.out.println("Hadiah\t: " + hadiah);
    }
}
