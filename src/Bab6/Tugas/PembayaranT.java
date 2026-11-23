package Bab6.Tugas;

import java.text.NumberFormat;
import java.util.Locale;

public class PembayaranT {
    String namaPelanggan;
    double jumlahPembayaran;

    public PembayaranT(String namaPelanggan, double jumlahPembayaran) {
        this.namaPelanggan = namaPelanggan;
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran sedang diproses.");
    }

    public void tampilkanInformasi() {
        NumberFormat format = NumberFormat.getCurrencyInstance(
                new Locale("id", "ID")
        );

        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jumlah Pembayaran: " +
                format.format(jumlahPembayaran));
    }
}
