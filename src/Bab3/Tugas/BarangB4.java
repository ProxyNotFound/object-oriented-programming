package Bab3.Tugas;

import java.util.Scanner;

public class BarangB4 {
    String kode;
    double harga;
    int jumlah;

    double hitungTotal() {
        return harga * jumlah;
    }
}

class MainB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BarangB4 b = new BarangB4();

        System.out.print("Kode Barang: ");
        b.kode = sc.nextLine();

        System.out.print("Harga: ");
        b.harga = sc.nextDouble();

        System.out.print("Jumlah: ");
        b.jumlah = sc.nextInt();

        System.out.println("Total transaksi untuk " + b.kode + " = Rp" + b.hitungTotal());

        sc.close();
    }
}