package Bab3.Tugas;

import java.util.Scanner;

public class BarangD1 {
    String nama;
    double harga;
    int jumlah;

    double subtotal() {
        return harga * jumlah;
    }
}

class MainD1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalBelanja = 0;
        String lanjut = "y";

        System.out.println("===PROGRAM KASIR===");

        while (lanjut.equalsIgnoreCase("y")) {
            BarangD1 b = new BarangD1();

            System.out.print("Nama barang:");
            b.nama = scan.nextLine();

            System.out.print("Harga barang:");
            b.harga = scan.nextDouble();

            System.out.print("Jumlah barang:");
            b.jumlah = scan.nextInt();
            scan.nextLine();

            double sub = b.subtotal();
            totalBelanja += sub;

            System.out.println(b.nama + " x" + b.jumlah + "=Rp" + sub);

            System.out.print("Tambah barang lain? (y/n):");
            lanjut = scan.nextLine();
        }

        System.out.println("\n===STRUK BELANJA===");
        System.out.println("Total Belanja: Rp" + totalBelanja);

        scan.close();
    }
}