package Bab8.Tugas;

import java.util.ArrayList;
import java.util.Scanner;
public class DemoPembayaran8T {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pembayaran8T> daftarTransaksi = new ArrayList<>();
        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMBAYARAN ===");
            System.out.println("1. Buat Pembayaran Tunai");
            System.out.println("2. Buat Pembayaran Kartu");
            System.out.println("3. Buat Pembayaran E-Wallet");
            System.out.println("4. Tampilkan Semua Transaksi");
            System.out.println("5. Tampilkan Total Seluruh Pembayaran");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan ID Transaksi: ");
                String id = input.nextLine();
                System.out.print("Masukkan Jumlah Pembayaran: ");
                double jumlah = input.nextDouble();

                if (jumlah <= 0) {
                    System.out.println("Error: Jumlah pembayaran harus lebih dari 0! Transaksi dibatalkan.");
                    continue;
                }

                Pembayaran8T transaksi = null;
                if (pilihan == 1) {
                    transaksi = new Tunai8T(id, jumlah);
                } else if (pilihan == 2) {
                    transaksi = new Kartu8T(id, jumlah);
                } else if (pilihan == 3) {
                    transaksi = new EWallet8T(id, jumlah);
                }

                daftarTransaksi.add(transaksi);
                System.out.println("Transaksi berhasil ditambahkan!");

            } else if (pilihan == 4) {
                if (daftarTransaksi.isEmpty()) {
                    System.out.println("Belum ada transaksi yang tercatat.");
                } else {
                    System.out.println("\n=== DAFTAR SEMUA TRANSAKSI ===");
                    for (Pembayaran8T p : daftarTransaksi) {
                        p.tampilkanStruk();
                    }
                }

            } else if (pilihan == 5) {
                double totalKeseluruhan = 0;
                for (Pembayaran8T p : daftarTransaksi) {
                    totalKeseluruhan += p.hitungTotal();
                }
                System.out.printf("Total Seluruh Pembayaran: Rp %.2f%n", totalKeseluruhan);

            } else if (pilihan == 6) {
                System.out.println("Terima kasih. Program selesai.");
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }

        } while (pilihan != 6);

        input.close();
    }
}
