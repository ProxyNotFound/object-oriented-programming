package Bab6.Tugas;

import java.util.Scanner;
public class MainPembayaranT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PEMBAYARAN ===");
        System.out.println("1. Pembayaran Tunai");
        System.out.println("2. Transfer Bank");
        System.out.println("3. Dompet Digital");
        System.out.print("Pilih metode pembayaran: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Pilihan tidak valid.");
            input.close();
            return;
        }

        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = input.nextDouble();

        if (jumlah <= 0) {
            System.out.println("Jumlah pembayaran harus lebih dari 0.");
            input.close();
            return;
        }

        PembayaranT pembayaran;

        switch (pilihan) {
            case 1:
                pembayaran = new TunaiT(nama, jumlah);
                break;
            case 2:
                pembayaran = new TransferT(nama, jumlah);
                break;
            default:
                pembayaran = new DompetDigitalT(nama, jumlah);
                break;
        }

        System.out.println("\n=== INFORMASI PEMBAYARAN ===");
        pembayaran.tampilkanInformasi();
        pembayaran.prosesPembayaran();

        input.close();
    }
}
