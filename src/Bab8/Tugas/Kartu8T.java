package Bab8.Tugas;

public class Kartu8T extends Pembayaran8T {
    public Kartu8T(String idTransaksi, double jumlah) {
        super(idTransaksi, jumlah);
    }

    @Override
    protected double hitungBiayaLayanan() {
        return 0.02 * getJumlah();
    }
}
