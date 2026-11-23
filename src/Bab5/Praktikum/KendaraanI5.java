package Bab5.Praktikum;

public class KendaraanI5 {
    String merk;
    String warna;
    int tahun;

    public KendaraanI5(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Merk : " + this.merk);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);
    }
}
