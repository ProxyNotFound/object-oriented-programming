package Bab8.Praktikum;

public class Lingkaran83 extends BangunDatar83 {
    private double jariJari;

    public Lingkaran83(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
