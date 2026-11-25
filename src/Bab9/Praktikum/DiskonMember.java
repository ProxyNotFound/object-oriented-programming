package Bab9.Praktikum;

public class DiskonMember implements Diskon {
    @Override
    public String getNama() {
        return "Diskon Member";
    }
    @Override
    public double hitungDiskon(double total) {
        return total * 10 / 100;
    }
}
