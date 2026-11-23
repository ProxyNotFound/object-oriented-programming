package Bab6.Tugas;

public class TunaiT extends PembayaranT {

    public TunaiT(String namaPelanggan, double jumlahPembayaran) {
        super(namaPelanggan, jumlahPembayaran);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran dilakukan secara tunai.");
    }
}
