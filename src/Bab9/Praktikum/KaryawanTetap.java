package Bab9.Praktikum;
public class KaryawanTetap extends Karyawan {
    public KaryawanTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }
    @Override
    public double hitungGaji() {
        return getGajiPokok();
    }
    public double hitungBonus() {
        return getGajiPokok() * 10 / 100;
    }
}
