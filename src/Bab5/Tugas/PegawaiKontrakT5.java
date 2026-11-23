package Bab5.Tugas;

public class PegawaiKontrakT5 extends PegawaiT5 {
    private double gajiBulanan;
    private int lamaKontrak;

    public PegawaiKontrakT5(String nama, String id, double gajiBulanan, int lamaKontrak) {
        super(nama, id);
        this.gajiBulanan = gajiBulanan;
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis        : Pegawai Kontrak");
        System.out.println("Gaji Bulanan : Rp" + gajiBulanan);
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan");
    }

    @Override
    public double hitungPendapatan() {
        return gajiBulanan * lamaKontrak;
    }
}
