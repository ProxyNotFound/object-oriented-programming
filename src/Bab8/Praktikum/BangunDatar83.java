package Bab8.Praktikum;

public abstract class BangunDatar83 {
    private String nama;

    public BangunDatar83(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungLuas();

    public abstract double hitungKeliling();

    public void tampilkanInfo() {
        System.out.println("Bangun datar: " + nama);
        System.out.println("Luas: " + Math.round(hitungLuas() * 100.0) / 100.0);
        System.out.println("Keliling: " + Math.round(hitungKeliling() * 100.0) /
                100.0);
    }
}