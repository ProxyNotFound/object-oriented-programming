package Bab8.Praktikum;

public class RekeningTabungan85 extends Rekening85 {
    public RekeningTabungan85(String nomor, double saldoAwal) {
        super(nomor, saldoAwal);
    }

    @Override
    protected double hitungBiayaAdmin() {
        return 2500;
    }
}
