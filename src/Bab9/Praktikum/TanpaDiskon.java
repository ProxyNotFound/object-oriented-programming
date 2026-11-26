package Bab9.Praktikum;

public class TanpaDiskon implements Diskon {
    @Override
    public String getNama() {
        return "Tanpa Diskon";
    }
    @Override
    public double hitungDiskon(double total) {
        return 0;
    }
}
