package Bab7.Praktikum;

public class RekeningBank75 {
    private double saldo;

    public RekeningBank75(double saldoAwal) {
        if (saldoAwal >= 0) {
            saldo = saldoAwal;
        } else {
            saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil");
        } else {
            System.out.println("Jumlah setoran tidak valid");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil");
        }
    }
}
