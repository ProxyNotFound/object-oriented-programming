package Bab8.Praktikum;

public class DemoPolimorfisme84 {
    public static void main(String[] args) {
        BangunDatar83[] daftar = {
                new PersegiPanjang83(10, 5),
                new Lingkaran83(7),
                new PersegiPanjang83(4, 3),
                new Segitiga84(20,12)
        };
        double totalLuas = 0;
        for (BangunDatar83 bangun : daftar) {
            bangun.tampilkanInfo();
            System.out.println();
            totalLuas += bangun.hitungLuas();
        }
        System.out.println("Total luas: " + Math.round(totalLuas * 100.0) /
                100.0);
    }
}
