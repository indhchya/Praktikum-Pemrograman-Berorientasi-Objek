/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
//kelas turunan Mobil
public class Mobil extends KendaraanDarat{
    int jumlahPintu;
    String model;
    
    //metode override untuk menampilkan informasi dari kelas Mobil
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Model: " + model);
    }
}
