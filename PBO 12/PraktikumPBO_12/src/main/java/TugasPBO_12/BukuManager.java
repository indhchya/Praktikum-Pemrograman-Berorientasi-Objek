/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_12;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BukuManager {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan Buku ke dalam File (buku.txt)");
            System.out.println("3. Simpan Buku ke dalam File Serialisasi (buku.ser)");
            System.out.println("4. Tampilkan Buku dari File (buku.txt)");
            System.out.println("5. Tampilkan Buku dari File (buku.ser)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerialisasi();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerialisasi();
                case 6 -> {
                    System.out.println("Keluar dari sistem");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang buku: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        bukuList.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString());
                writer.newLine();
            }
            System.out.println("Data buku berhasil disimpan ke file teks." + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerialisasi() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Data buku berhasil disimpan ke file serialisasi." + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serialisasi.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileTeks() {
        System.out.println("\nDaftar Buku dari File Serial (buku.txt)");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileSerialisasi() {
        System.out.println("\nDaftar Buku dari File Serial (buku.ser)");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuDariFile = (List<Buku>) ois.readObject();
            for (Buku buku : bukuDariFile) {
                System.out.println(buku);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serialisasi.");
            e.printStackTrace();
        }
    }
}

