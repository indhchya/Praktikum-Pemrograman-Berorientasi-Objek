/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}

