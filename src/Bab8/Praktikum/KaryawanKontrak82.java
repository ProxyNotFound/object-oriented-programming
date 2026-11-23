package Bab8.Praktikum;

public class KaryawanKontrak82 extends Karyawan82{
    private double bonusProyek;

    public KaryawanKontrak82(String nama, double gajiPokok, double bonusProyek) {
        super(nama, gajiPokok);
        this.bonusProyek = bonusProyek;
    }
    @Override
    public double hitungGaji() {
        return getGajiPokok() + bonusProyek;
    }
}
