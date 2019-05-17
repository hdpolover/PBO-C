/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author hendr
 */
public class Tugas_2_DemoAlatku {

    static int inputInt() {
        int a = InputConsole1.readInt();
        return a;
    }

    static String inputStr() {
        String a = InputConsole1.readString();
        return a;
    }

    void menu() {
        System.out.println("1. Operasi String");
        System.out.println("2. Operasi Matematika");
        System.out.print("Pilih: ");
        int pilih = inputInt();
        switch (pilih) {
            case 1:
                operasiString();
                break;
            case 2:
                operasiMat();
                break;
            default:
                System.out.println("Pilihan tidak tersedia. Coba lagi.");
                menu();
        }
    }

    void operasiString() {
        System.out.println("\nMasukan kalimat pertama: ");
        String str1 = inputStr();
        System.out.println("Masukan kalimat kedua: ");
        String str2 = inputStr();

        System.out.println("\n------------------------------------------------------");
        System.out.println("Kalimat 1 dalam huruf besar\t: " + OperasiString.upper(str1));
        System.out.println("Kalimat 1 dalam huruf kecil\t: " + OperasiString.lower(str1));
        System.out.println("Capitalize each word\t\t: " + OperasiString.wordUpper(str1));
        System.out.println("Balik kata\t\t\t: " + OperasiString.balik(str1));
        System.out.println("Jumlah karakter\t\t\t: " + OperasiString.jumlah(str1));
        System.out.println("Karakter pertama\t\t: " + OperasiString.karakterPertama(str1));
        System.out.println("Karakter terakhir\t\t: " + OperasiString.karakterTerakhir(str1));
        System.out.print("\nMasukan kata/karakter yang akan dicari dari kalimat pertama: ");
        String cari = inputStr();
        System.out.println("Ada kata/karakter \"" + cari + "\" atau tidak: " + OperasiString.cari(cari, str1));
        System.out.print("\nMasukan berapa batas awal: ");
        int b1 = inputInt();
        System.out.print("Masukan batas akhir: ");
        int b2 = inputInt();
        System.out.println("Kata/karakter dengan batas awal " + b1 + " dan batas akhir " + b2 + ": "
                + OperasiString.tampilBatas(b1, b2, str1));
        System.out.println("Apa kalimat 1 dan 2 sama: " + OperasiString.banding(str1, str2));
        System.out.println("\n---------------------------------------------------------------");
        cek();
    }

    void operasiMat() {
        System.out.print("\nMasukan angka ke-1: ");
        int angka1 = inputInt();
        System.out.print("Masukan angka ke-2: ");
        int angka2 = inputInt();

        System.out.println("\n------------------------------------------------");
        System.out.println("Angka ke-1\t\t: " + angka1 + OperasiMatematika.genapAtauGanjil(angka1));
        System.out.println("Angka ke-2\t\t: " + angka2 + OperasiMatematika.genapAtauGanjil(angka2));
        System.out.println("Angka ke-1\t\t: " + angka1 + OperasiMatematika.prima(angka1));
        System.out.println("Angka ke-2\t\t: " + angka2 + OperasiMatematika.prima(angka2));
        System.out.println("Hasil penjumlahan\t: " + angka1 + " + " + angka2 + " = " + OperasiMatematika.tambah(angka1, angka2));
        System.out.println("Hasil pengurangan\t: " + angka1 + " - " + angka2 + " = " + OperasiMatematika.kurang(angka1, angka2));
        System.out.println("Hasil perkalian\t\t: " + angka1 + " * " + angka2 + " = " + OperasiMatematika.kali(angka1, angka2));
        System.out.println("Hasil pembagian\t\t: " + angka1 + " / " + angka2 + " = " + OperasiMatematika.bagi(angka1, angka2));
        System.out.println("Hasil pangkat\t\t: " + angka1 + " ^ " + angka2 + " = " + OperasiMatematika.pangkat(angka1, angka2));
        System.out.println("Menampilkan \"*\" sebanyak " + angka1 + " kali: " + OperasiMatematika.bintang(angka1));
        System.out.println("Menampilkan \"*\" sebanyak " + angka2 + " kali: " + OperasiMatematika.bintang(angka2));
        System.out.println("\n---------------------------------------------------------------");
        cek();
    }

    void cek() {
        System.out.println("Coba lagi? (Y/N)");
        String coba = inputStr();
        System.out.println("");
        if (coba.equalsIgnoreCase("y")) {
            menu();
        } else {
            System.out.println("Terimakasih.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Tugas_2_DemoAlatku d = new Tugas_2_DemoAlatku();

        d.menu();
    }
}
