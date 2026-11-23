package Bab5.Praktikum;

public class DemoKendaraanI4 {
    public static void main(String[] args) {
        MobilI4 mobilI4 = new MobilI4("Toyota", "Hitam", 4);
        MotorI4 motorI4 = new MotorI4("Honda", "Merah", 150);

        System.out.println("=== DATA MOBIL ===");
        mobilI4.tampilkanMobilI4();

        System.out.println("=== DATA Motor ===");
        motorI4.tampilkanMotorI4();
    }
}
