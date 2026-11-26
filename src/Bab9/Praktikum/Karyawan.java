package Bab9.Praktikum;
public abstract class Karyawan {
    private String nama;
    private double gajiPokok;
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            this.gajiPokok = 0;
        }
    }
    public String getNama() {
        return nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public abstract double hitungGaji();
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Total gaji: Rp" + hitungGaji());
    }
}
