/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

/**
 *
 * @author hendr
 */
public class Sesi_6_DemoPembagianNol {

    public void pembagian() {
        int bil1 = 25;
        int bil2 = 0;

        System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
        System.out.println("keluar dari method pembagian.");
    }

    public static void main(String[] args) {
        new Sesi_6_DemoTryCatch().pembagian();
    }
}
