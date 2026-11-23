package Bab8.Tugas;

public class EWallet8T extends Pembayaran8T {
    public EWallet8T(String idTransaksi, double jumlah) {
        super(idTransaksi, jumlah);
    }

    @Override
    protected double hitungBiayaLayanan() {
        return 1500;
    }
}
