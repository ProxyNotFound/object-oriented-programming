package Bab8.Tugas;

public class Tunai8T extends Pembayaran8T {
    public Tunai8T(String idTransaksi, double jumlah) {
        super(idTransaksi, jumlah);
    }

    @Override
    protected double hitungBiayaLayanan() {
        return 0;
    }
}
