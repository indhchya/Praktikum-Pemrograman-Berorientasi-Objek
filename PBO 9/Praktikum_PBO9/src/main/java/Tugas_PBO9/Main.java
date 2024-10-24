/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO9;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        
        kucing.info();
        kucing.suara();

        anjing.info();  
        anjing.suara(); 
    }
}





