package Bab5.Praktikum;

public class MobilI5 extends KendaraanI5 {
    int jumlahPintu;

    public MobilI5(String merk, String warna, int tahun, int jumlahPintu) {
        super(merk, warna, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanMobilI5() {
        System.out.println("\n=== DATA MOBIL ===");
        tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
