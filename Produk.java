/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.praktikum_pbo6;

/**
 *
 * @author user
 */
public class Produk {
    String nama;
    double harga;

    Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    double hitungDiskon() {
        return 0; // Default, tidak ada diskon di kelas Produk
    }

    // Metode ini menggunakan hitungDiskon() untuk menghitung harga akhir
    double hargaSetelahDiskon() {
        return harga - hitungDiskon(); // Mengurangi harga dengan diskon
    }

    // Tampilkan info produk secara umum
    String tampilkanInfo() {
        return nama + " - Harga: " + harga + 
               ", Diskon: " + hitungDiskon() + 
               ", Harga Setelah Diskon: " + hargaSetelahDiskon();
    }
}


