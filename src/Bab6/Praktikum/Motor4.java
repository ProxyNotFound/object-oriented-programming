package Bab6.Praktikum;

public class Motor4 extends Kendaraan4 {
    Motor4(String merk) {
        super(merk);
    }
    @Override
    void bergerak() {
        System.out.println("Motor bergerak di jalan");
    }
}
