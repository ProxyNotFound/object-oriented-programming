package Bab6.Praktikum;

public class DemoKendaraan4 {
    public static void main(String[] args) {
        Kendaraan4 kendaraan1 = new Mobil4("Toyota");
        Kendaraan4 kendaraan2 = new Motor4("Honda");
        kendaraan1.tampilkanInfo();
        kendaraan1.bergerak();
        System.out.println();
        kendaraan2.tampilkanInfo();
        kendaraan2.bergerak();
    }
}
