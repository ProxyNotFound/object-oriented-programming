package Bab8.Praktikum;

public class KaryawanTetap82 extends Karyawan82 {
    private double tunjangan;

    public KaryawanTetap82(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + tunjangan;
    }
}
