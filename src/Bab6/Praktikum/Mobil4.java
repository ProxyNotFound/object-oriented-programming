package Bab6.Praktikum;

public class Mobil4 extends Kendaraan4 {
    Mobil4(String merk) {
        super(merk);
    }
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak di jalan raya");
    }
}