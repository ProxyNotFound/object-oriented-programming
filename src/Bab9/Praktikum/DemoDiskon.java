package Bab9.Praktikum;

import java.util.Scanner;
public class DemoDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== KASIR DENGAN DISKON ===");
        System.out.print("Masukkan total belanja: ");
        double total = input.nextDouble();
        if (total <= 0) {
            System.out.println("Total belanja tidak valid");
            input.close();
            return;
        }
        System.out.println("1. Tanpa Diskon");
        System.out.println("2. Diskon Member");
        System.out.println("3. Diskon Hari Raya");
        System.out.print("Pilih jenis diskon: ");
        int pilihan = input.nextInt();
        Diskon diskon;
        if (pilihan == 1) {
            diskon = new TanpaDiskon();
        } else if (pilihan == 2) {
            diskon = new DiskonMember();
        } else if (pilihan == 3) {
            diskon = new DiskonHariRaya();
        } else {
            System.out.println("Pilihan tidak valid");
            input.close();
            return;
        }
        double potongan = diskon.hitungDiskon(total);
        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Jenis diskon : " + diskon.getNama());
        System.out.println("Total belanja: Rp" + total);
        System.out.println("Potongan : Rp" + potongan);
        System.out.println("Total bayar : Rp" + (total - potongan));
        input.close();
    }
}
