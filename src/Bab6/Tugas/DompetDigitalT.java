package Bab6.Tugas;

public class DompetDigitalT extends PembayaranT {

    public DompetDigitalT(String namaPelanggan, double jumlahPembayaran) {
        super(namaPelanggan, jumlahPembayaran);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran dilakukan melalui dompet digital.");
    }
}
