/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
//kelas induk Kendaraan
public class Kendaraan {
    String nama;
    int kecepatan;
    
    //metode tampilkanInfo untuk menampilkan informasi dari kendaraan
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
    }  
}

