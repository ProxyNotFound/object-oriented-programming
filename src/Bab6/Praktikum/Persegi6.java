package Bab6.Praktikum;

public class Persegi6 extends BangunDatar6 {
    double sisi;
    Persegi6(double sisi) {
        this.sisi = sisi;
    }
    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}
