/*
 * File     : Sesi_2_DemoIf.java
 * Title    : Program Test penyeleksian kondisi if
* Deskripsi : Menggunakan if untuk menyeleksi nilai 
*/
package Pertemuan3;

/**
 *
 * @author hendr
 */
public class Sesi_2_DemoIf {
    
    //Main method
    public static void main(String[] args) {
        double nilai;
        
        System.out.println("\nPROGRAM DEMO IF");
        System.out.println("----------------\n");
        
        nilai = 45;
        
        //menyelesaikan kondisi dan mencetak hasil ke console
        if (nilai >= 60) {
            System.out.println("\nSelamat, anda lulus mata kuliah ini.");
            System.out.println("\nSyukur!.");
        } else {
            System.out.println("\nAnda gagal pada mata kuliah ini.");
            System.out.println("\nSyokor!.");
        }
    }
}
