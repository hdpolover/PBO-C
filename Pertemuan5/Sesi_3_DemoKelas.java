/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author hendr
 */
public class Sesi_3_DemoKelas {

    public static void main(String[] args) {
        System.out.println("PROGRAM DEMO KELAS");
        System.out.println("-------------------");

        Pesanku sms = new Pesanku();

        sms.salam();
        System.out.println("Hasil: " + sms.tambah(5, 2));

        System.out.println("---------------------------------");

        Identitas n = new Identitas();

        String nama = "hendra";
        System.out.println("Nama: " + n.nama(nama));
        System.out.println("Panjang: " + n.panjangNama(nama));
        n.balikNama(nama);

        System.out.println("----------------------------------");
        Quiz q = new Quiz();
        q.quiz1();
        q.quiz2();
        q.quiz3();
        q.quiz4();
    }
}

class Pesanku {

    public void salam() {
        System.out.println("Salam kenal masbro...");
    }

    public int tambah(int a, int b) {
        return a + b;
    }
}

class Identitas {

    public String nama(String n) {
        return n;
    }

    public int panjangNama(String n) {
        return n.length();
    }

    public void balikNama(String kata) {
        System.out.print("Kata balik: ");
        for (int i = kata.length() - 1; i >= 0; i--) {
            System.out.print(kata.charAt(i));
        }
        System.out.println("");
    }
}

class Quiz {

    public void quiz1() {
        System.out.print("Quiz_01: ");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public void quiz2() {
        System.out.print("Quiz_02: ");
        for (int i = 4; i < 35; i = (i * 2) - 2) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public void quiz3() {
        System.out.print("Quiz_03: ");
        int i = 5;
        for (int j = 10; j < 40; j += 8) {
            int y = i;
            System.out.print(y + ", ");
            System.out.print(j + ", ");
            i += 5;
        }
        System.out.println("");
    }

    public void quiz4() {
        System.out.print("Quiz_04: ");
        int a = 2;
        int b = 5;
        int x = 5;
        int y = 4;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + ", ");
            a += x;
            x *= 3;
            System.out.print(b + ", ");
            b += y;
            y *= 2;
        }
    }
}
