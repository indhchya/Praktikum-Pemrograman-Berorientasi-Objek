/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.responsiuts.indah_cahya;

/**
 *
 * @author user
 */
// Main class untuk implementasi Polimorfisme
public class Main {
    public static void main(String[] args) {
        // Objek Produk
        Produk produk1 = new Elektronik("Laptop ASUS Vivobook RYZEN 5", 15000000, 2);
        Produk produk2 = new Makanan("Snack Taro ", 15000, "2023-12-30");

        // Objek Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Indah Cahya", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Bimo Ghiffari", 3000000, 12);

        // Output Produk
        System.out.println("Output Produk");
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();

        // Output Pegawai
        System.out.println("\nOutput Pegawai");
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();

        // Output Polimorfisme
        System.out.println("\nOutput Polimorfisme");
        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
