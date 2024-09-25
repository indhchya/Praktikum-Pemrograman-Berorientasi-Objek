/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        //membuat objek untuk Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 240;
        mobil.jumlahPintu = 5;
        mobil.jumlahRoda = 4;
        mobil.model = "Fortuner";
        mobil.tampilkanInfo();
        
        System.out.println("");
        
        //membuat objek untuk SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha NMAX";
        motor.kecepatan = 140;
        motor.jenisMesin = "2-tak";
        motor.jumlahRoda = 2;
        motor.tampilkanInfo();
    }  
}

