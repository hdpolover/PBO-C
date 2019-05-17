/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author hendr
 */
public class LatihanFunctionDanProcedure {

    static int poin = 0;

    static String keterangan(int nilai) {
        String ket = "";
        if (nilai > 65) {
            ket = "Lulus";
            poin += 150;
        } else {
            ket = "Tidak Lulus";
        }
        return ket;
    }

    static String grade(int nilai) {
        String grade = "";
        if (nilai > 85) {
            grade = "A";
            poin += 200;
        } else if (nilai > 70) {
            grade = "B";
            poin += 100;
        } else if (nilai > 65) {
            grade = "C";
            poin += 50;
        } else if (nilai > 40) {
            grade = "D";
            poin += 10;
        } else {
            grade = "E";
            poin += 5;
        }
        return grade;
    }

    static void point(int nilai) {
         if (nilai > 0 && nilai <= 65) {
            poin += 50;
        } else if (nilai > 70 && nilai <= 100) {
            poin += 50;
        } else {
            poin -= 50;
        }
         System.out.print(poin);
    }
    
    static String reward(int nilai) {
        String reward = "";
        if (nilai > 0 && nilai <= 65) {
            reward = "Medal";
            poin += 50;
        } else if (nilai > 70 && nilai <= 100) {
            reward = "Medal";
            poin += 50;
        } else {
            reward = "\t";
            poin -= 50;
        }
        if (nilai >= 40 && nilai <= 55) {
            reward = reward + " Masih ada Kesempatan";
        } else if (nilai >= 75 && nilai <= 90) {
            reward = reward + " Harus lebih fokus";
        }
        return reward;
    }
    
    static void print(int nilai) {
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println("Keterangan\t: " + keterangan(nilai));
        System.out.println("Grade\t\t: " + grade(nilai));
        System.out.println("Reward\t\t: " + reward(nilai));
        System.out.print("Point\t\t: " + poin);
        //point(nilai);
    }

    
    void cek() {
    }

    public static void main(String[] args) {
        int nilai = 68;
        
        print(nilai);
    }
}
