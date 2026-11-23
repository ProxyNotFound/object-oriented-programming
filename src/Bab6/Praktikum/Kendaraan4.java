package Bab6.Praktikum;

public class Kendaraan4 {
    String merk;
    Kendaraan4(String merk) {
        this.merk = merk;
    }
    void bergerak() {
        System.out.println("Kendaraan sedang bergerak");
    }
    void tampilkanInfo() {
        System.out.println("Merk: " + merk);
    }
}
