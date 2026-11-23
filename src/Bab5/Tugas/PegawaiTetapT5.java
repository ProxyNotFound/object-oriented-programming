package Bab5.Tugas;

public class PegawaiTetapT5 extends PegawaiT5 {
    private double gajiBulanan;

    public PegawaiTetapT5(String nama, String id, double gajiBulanan) {
        super(nama, id);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis        : Pegawai Tetap");
        System.out.println("Gaji Bulanan : Rp" + gajiBulanan);
    }

    @Override
    public double hitungPendapatan() {
        return gajiBulanan;
    }
}
