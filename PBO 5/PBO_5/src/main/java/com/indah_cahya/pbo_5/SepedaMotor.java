/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
//kelas turunan SepedaMotor
public class SepedaMotor extends KendaraanDarat{
    String jenisMesin;
    
    //metode override untuk menampilkan informasi dari SepedaMotor
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}


