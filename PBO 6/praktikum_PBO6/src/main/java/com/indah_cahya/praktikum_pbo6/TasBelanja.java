/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.praktikum_pbo6;

/**
 *
 * @author user
 */
public class TasBelanja {
    Produk[] produkList;
    int index;

    TasBelanja() {
        produkList = new Produk[10]; // Kapasitas awal 10 produk
        index = 0;
    }

    void tambahProduk(Produk produk) {
        if (index < produkList.length) {
            produkList[index] = produk;
            index++;
        }
    }

    double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += produkList[i].hargaSetelahDiskon();
            System.out.println(produkList[i].tampilkanInfo());
        }
        return total;
    }
}




