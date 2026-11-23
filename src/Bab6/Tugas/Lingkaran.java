package Bab6.Tugas;

public class Lingkaran extends Shape {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
}