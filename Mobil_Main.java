/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author user
 */
public class Mobil_Main {
    public static void main(String[] args) {
        System.out.println("Target 1");
        Mobil Indah = new Mobil("MPV", "SPORT", 2022, "Hitam");
        Indah.displayInfo();
        Indah.startEngine();
        Indah.ubahWarna("Merah");
        System.out.println("");
        System.out.println("");
        System.out.println("Target 2");
        Mobil Cahaya = new Mobil("BMW", "FERARI", 2021, "Putih");
        Cahaya.displayInfo();
        Cahaya.startEngine();
        Cahaya.ubahWarna("Abu-abu");
    }
}
