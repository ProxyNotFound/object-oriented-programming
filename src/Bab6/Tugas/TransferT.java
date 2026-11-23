package Bab6.Tugas;

public class TransferT extends PembayaranT {

    public TransferT(String namaPelanggan, double jumlahPembayaran) {
        super(namaPelanggan, jumlahPembayaran);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran dilakukan melalui transfer bank.");
    }
}
