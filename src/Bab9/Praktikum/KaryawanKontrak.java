package Bab9.Praktikum;

public class KaryawanKontrak extends Karyawan {
    public KaryawanKontrak(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }
    @Override
    public double hitungGaji() {
        return getGajiPokok();
    }
}
