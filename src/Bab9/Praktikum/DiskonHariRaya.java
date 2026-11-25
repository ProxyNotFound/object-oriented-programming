package Bab9.Praktikum;

public class DiskonHariRaya implements Diskon {
    @Override
    public String getNama() {
        return "Diskon Hari Raya";
    }
    @Override
    public double hitungDiskon(double total) {
        return total * 20 / 100;
    }
}