package Bab9.Interface;

public class TunaiT9 implements BayarT9{
    @Override
    public void bayarT9(double jumlah) {
        System.out.println("Membayar menggunakan tunai: Rp" + jumlah);
    }
}
