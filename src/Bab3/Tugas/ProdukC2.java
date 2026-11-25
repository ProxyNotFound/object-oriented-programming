package Bab3.Tugas;

import java.util.Scanner;

public class ProdukC2 {
    String kode;
    double harga;
    int stok;

    void beli(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pembelian tidak valid.");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi. Sisa stok: " + stok);
        } else {
            double total = harga * jumlah;
            stok -= jumlah;

            System.out.println("=== Struk Pembelian ===");
            System.out.println("Kode Produk : " + kode);
            System.out.println("Jumlah Beli : " + jumlah);
            System.out.println("Total Bayar : Rp" + total);
            System.out.println("Sisa Stok : " + stok);
        }
    }
}

class MainC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProdukC2 p = new ProdukC2();

        System.out.print("Kode Produk: ");
        p.kode = sc.nextLine();

        System.out.print("Harga: ");
        p.harga = sc.nextDouble();

        System.out.print("Stok Tersedia: ");
        p.stok = sc.nextInt();

        System.out.print("Jumlah ingin dibeli: ");
        int jumlahBeli = sc.nextInt();

        p.beli(jumlahBeli);

        sc.close();
    }
}