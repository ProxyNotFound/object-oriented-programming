package Bab5.Praktikum;

public class MotorI5 extends KendaraanI5 {
    int kapasitasMesin;

    public MotorI5(String merk, String warna, int tahun, int kapasitasMesin) {
        super(merk, warna, tahun);
        this.kapasitasMesin = kapasitasMesin;
    }

    public void tampilkanMotorI5() {
        System.out.println("\n=== DATA MOTOR ===");
        tampilkanInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}
