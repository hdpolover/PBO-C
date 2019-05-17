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
public class OperasiString {
    public static String upper(String n) {
        return n.toUpperCase();
    }
    
    public static String lower(String n) {
        return n.toLowerCase();
    }
    
    public static String wordUpper(String n) {
        String[] splitStr = n.trim().split("\\s+");
        String[] upper = new String[splitStr.length];
        for (int i = 0; i < splitStr.length; i++) {
            upper[i] = splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1).toLowerCase();
        }
        String a = "";
        for (int i = 0; i < upper.length; i++) {
            a = a + upper[i] + " ";
        }
        return a;
    }
    
    public static String balik(String n) {
        String a = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            a = a + n.toUpperCase().charAt(i);
        }
        return a;
    }
    
    public static int jumlah(String n) {
        return n.length();
    }
    
    public static char karakterPertama(String n) {
        return n.toUpperCase().charAt(0);
    }
    
    public static boolean banding(String n, String o) {
        return n.equals(o);
    }
    
    public static char karakterTerakhir(String n) {
        return n.toUpperCase().charAt(n.length() - 1);
    }
    
    public static boolean cari(String n, String o) {
        return o.contains(n);
    }
    
    public static String tampilBatas(int a, int b, String n) {
        return n.substring((a-1), (b-1));
    }
}
