/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
//kelas induk hewan
public class Hewan {
    String namaHewan;
    int umur;
    String jenis;

    // Method untuk menampilkan informasi hewan
    public void TampilkanInfo() {
        System.out.println("Nama: " + namaHewan);
        System.out.println("Umur: " + umur + " Tahun");
        System.out.println("Jenis: " + jenis);
    }
}


