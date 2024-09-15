/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        pekerja orang1 = new pekerja("Indah",22,"Kowad",9000000);
        
        System.out.println("-- "+orang1.getNama()+" --");
        orang1.OverridemetodetoString();
        
        System.out.println();
        
        orang1.setNama("Cahaya");
        orang1.setGaji(6000000);
        System.out.println("-- "+orang1.getNama()+" --");
        orang1.OverridemetodetoString();
    }
}
