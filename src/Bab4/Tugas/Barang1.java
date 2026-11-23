package Bab4.Tugas;

import java.util.Scanner;
public class Barang1 {
    String kode;
    String nama;
    double harga;
    int jumlah;

    Barang1(String kode, String nama, double harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    double hitungSubtotal(){
        return harga * jumlah;
    }
    void tampilkanInfo(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        System.out.println("Harga:Rp "+harga);
        System.out.println("Jumlah: "+jumlah);
        System.out.println("Subtotal:Rp "+hitungSubtotal());
    }
}
class MainKasir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBelanja = 0;
        String lanjut = "y";

        System.out.println("=== PROGRAM KASIR ===");
        while(lanjut.equalsIgnoreCase("y")) {
            System.out.print("Kode Barang: ");
            String kode = input.nextLine();
            System.out.print("Nama Barang: ");
            String nama = input.nextLine();
            System.out.print("Harga: ");
            double harga = input.nextDouble();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();
            input.nextLine();

            Barang1 b = new Barang1(kode, nama, harga, jumlah);
            b.tampilkanInfo();
            totalBelanja += b.hitungSubtotal();

            System.out.println("Tambah barang lain?(y/n): ");
            lanjut = input.nextLine();
        }
        double diskon = 0;
        if (totalBelanja >= 200000) {
            diskon = totalBelanja * 0.15;
        }else if (totalBelanja >= 100000){
            diskon = totalBelanja * 0.10;
        }
        double totalBayar = totalBelanja - diskon;

        System.out.println("\n=== STRUK BELANJA ===");
        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp"+diskon);
        System.out.println("Total Pembayaran: Rp"+totalBayar);
        input.close();
    }
}