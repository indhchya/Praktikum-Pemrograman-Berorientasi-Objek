/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.praktikum_pbo6;

/**
 *
 * @author user
 */
public class MainProduk {
    public static void main(String[] args) {
        TasBelanja keranjang = new TasBelanja();

        Produk buku1 = new Buku("Buku Tere Liye", 100000, 10); // Diskon 10%
        Produk elektronik1 = new Elektronik("Elektronik Kulkas", 2000000, 15); // Diskon flat 3000000
        Produk pakaian1 = new Pakaian("Baju Blouse", 200000, 30); // Diskon 5%

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        double totalHarga = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}




