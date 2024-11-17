/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author user
 */
public class Buku {
    private String judul;
    private Pengarang pengarang;  // Agregasi

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
    public void remove() {
        System.out.println("Judul Buku: '" + judul + "' dihapus.");
    }
}
