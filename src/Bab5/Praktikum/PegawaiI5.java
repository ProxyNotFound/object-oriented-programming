package Bab5.Praktikum;

public class PegawaiI5 {
    String nama;
    double gajiPokok;

    PegawaiI5(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
