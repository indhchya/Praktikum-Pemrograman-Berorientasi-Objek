/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.pbo_5;

/**
 *
 * @author user
 */
public class MainHewan {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();
        kucing1.namaHewan = "PIO";
        kucing1.umur = 5;
        kucing1.jenis = "Anggora";
        kucing1.TampilkanInfo();
        
        System.out.println("");
        
        //Membuat objek Anjing
        Anjing anjing2 = new Anjing();
        anjing2.namaHewan = "Scoobydo";
        anjing2.umur = 3;
        anjing2.jenis = "Pitbull";
        anjing2.TampilkanInfo();
    }      
}

