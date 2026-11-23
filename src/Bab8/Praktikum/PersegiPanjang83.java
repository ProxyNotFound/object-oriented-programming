package Bab8.Praktikum;

public class PersegiPanjang83 extends BangunDatar83 {
    private double panjang;
    private double lebar;
    public PersegiPanjang83(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
