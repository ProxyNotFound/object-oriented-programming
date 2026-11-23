package Bab8.Praktikum;

public class RekeningGiro85 extends Rekening85 {
    public RekeningGiro85(String nomor, double saldoAwal) {
        super(nomor, saldoAwal);
    }

    @Override
    protected double hitungBiayaAdmin() {
        return 5000;
    }
}
