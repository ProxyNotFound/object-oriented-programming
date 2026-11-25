package Bab9.Praktikum;

public class KaryawanTetap extends Karyawan implements PenerimaBonus {
    public KaryawanTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }
    @Override
    public double hitungGaji() {
        return getGajiPokok();
    }
    @Override
    public double hitungBonus() {
        return getGajiPokok() * 10 / 100;
    }
}