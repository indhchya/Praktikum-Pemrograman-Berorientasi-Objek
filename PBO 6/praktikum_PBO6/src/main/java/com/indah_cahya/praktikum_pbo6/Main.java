/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indah_cahya.praktikum_pbo6;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
        Hewan kucing1 = new Hewan(); // Kucing merupakan subclass dari Hewan
        kucing1.bersuara(); // Output: Hewan bersuara
        kucing1.makan("ikan"); // Output: Hewan makan ikan
        kucing1.makan("ikan", 2); // Output: Hewan makan 2 porsi ikan
    }
}

