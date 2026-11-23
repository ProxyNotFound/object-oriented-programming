package Bab7.Praktikum;

import java.util.Scanner;
public class DemoProduk76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama produk: ");
        String nama = input.nextLine();
        System.out.print("Masukkan harga produk: ");
        double harga = input.nextDouble();
        Produk produk = new Produk(nama, harga);
        System.out.println("\n=== INFORMASI PRODUK ===");
        produk.tampilkanInfo();
        input.close();
    }
}
