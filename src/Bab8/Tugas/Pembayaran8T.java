package Bab8.Tugas;

public abstract class Pembayaran8T {
    private String idTransaksi;
    private double jumlah;

    public Pembayaran8T(String idTransaksi, double jumlah) {
        this.idTransaksi = idTransaksi;
        if (jumlah < 0) {
            this.jumlah = 0;
        } else {
            this.jumlah = jumlah;
        }
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getJumlah() {
        return jumlah;
    }

    protected abstract double hitungBiayaLayanan();

    public double hitungTotal() {
        return jumlah + hitungBiayaLayanan();
    }

    public void tampilkanStruk() {
        System.out.println("------------------------------------");
        System.out.println("ID Transaksi  : " + getIdTransaksi());
        System.out.println("Jenis         : " + this.getClass().getSimpleName());
        System.out.printf("Jumlah Bayar  : Rp %.2f%n", getJumlah());
        System.out.printf("Biaya Layanan : Rp %.2f%n", hitungBiayaLayanan());
        System.out.printf("Total Bayar   : Rp %.2f%n", hitungTotal());
        System.out.println("------------------------------------");
    }
}
