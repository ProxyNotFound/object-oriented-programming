package Bab6.Tugas;

public class Persegi extends Shape {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}