/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("Eka Kurniawan");
        Pengarang pengarang2 = new Pengarang("Leila S. Chudori");

        Buku buku1 = new Buku("Cantik Itu Luka", pengarang1);
        Buku buku2 = new Buku("Laut Bercerita", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();
        System.out.println();

        // Membuat klub
        Klub klub = new Klub("Klub Pembaca");
        
        Anggota anggota1 = new Anggota("Indah Cahya Ramadhani");
        Anggota anggota2 = new Anggota("Sealvyana Dewi Permata");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        System.out.println("Informasi Klub:");
        klub.infoKlub();
        System.out.println();

        // Menghapus semua buku di perpustakaan
        System.out.println("Menghapus Perpustakaan:");
        perpustakaan.HapusPerpustakaan();
    }
}