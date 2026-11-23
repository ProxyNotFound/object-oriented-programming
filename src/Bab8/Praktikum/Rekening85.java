package Bab8.Praktikum;

public abstract class Rekening85 {
    private String nomor;
    private double saldo;
    public Rekening85(String nomor, double saldoAwal) {
        this.nomor = nomor;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public String getNomor() {
        return nomor;
    }

    public double getSaldo() {
        return saldo;
    }

    protected abstract double hitungBiayaAdmin();

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil");
        } else {
            System.out.println("Jumlah setoran tidak valid");
        }
    }

    public void tarik(double jumlah) {
        double total = jumlah + hitungBiayaAdmin();
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid");
        } else if (total > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= total;
            System.out.println("Penarikan berhasil");
        }
    }
}