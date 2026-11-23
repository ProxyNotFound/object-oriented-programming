package Bab9.Interface;

public class QrisT9 implements BayarT9 {
    @Override
    public void bayarT9(double jumlah) {
        System.out.println("Membayar menggunakan qris: Rp" + jumlah);
    }
}
