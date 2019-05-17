/*
* File : InputConsole.java
* Title : InputConsole method
* Deskripsi:Mengambil input data dari console.
 */
package Tugas2;

import java.io.*;

public class InputConsole1 {

    /**
     * Membaca string dari keyboard
     */
    public static String readString() {
        BufferedReader bfr
                = new BufferedReader(new InputStreamReader(System.in), 1);
// Menginisialisasi string
        String string = " ";
// Get the string from the keyboard
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
// Mengembalikan string hasil pembacaan dari keyboard
        return string;
    }

    /**
     * Mengambil nilai int dengan parsing string input dari keyboard
     */
    public static int readInt() {
        return Integer.parseInt(readString());
    }
//Mengambil nilai byte dengan parsing string input dari keyboard

    public static byte readByte() {
        return Byte.parseByte(readString());
    }
//Mengambil nilai short dengan parsing string input dari keyboard

    public static short readShort() {
        return Short.parseShort(readString());
    }
//Mengambil nilai long dengan parsing string input dari keyboard

    public static long readLong() {
        return Long.parseLong(readString());
    }
//Mengambil nilai float dengan parsing string input dari keyboard

    public static float readFloat() {
        return Float.parseFloat(readString());
    }
//Mengambil nilai double dengan parsing string input dari keyboard

    public static double readDouble() {
        return Double.parseDouble(readString());
    }
}
