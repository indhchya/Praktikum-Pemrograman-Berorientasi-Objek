/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
//class menengah KendaraanDarat yang diwarisi class Kendaraan 
public class KendaraanDarat extends Kendaraan{
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
