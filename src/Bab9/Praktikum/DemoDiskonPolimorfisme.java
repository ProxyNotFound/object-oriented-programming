package Bab9.Praktikum;

public class DemoDiskonPolimorfisme {
    public static void main(String[] args) {
        double total = 200000;
        Diskon[] daftar = {
                new TanpaDiskon(),
                new DiskonMember(),
                new DiskonHariRaya()
        };
        for (Diskon d : daftar) {
            double potongan = d.hitungDiskon(total);
            System.out.println(d.getNama() + ": potongan Rp" + potongan
                    + ", bayar Rp" + (total - potongan));
        }
    }
}
