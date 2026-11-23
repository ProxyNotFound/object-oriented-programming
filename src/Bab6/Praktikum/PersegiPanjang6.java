package Bab6.Praktikum;

public class PersegiPanjang6 extends BangunDatar6 {
    double panjang;
    double lebar;
    PersegiPanjang6(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    double hitungLuas() {
        return panjang * lebar;
    }
}
