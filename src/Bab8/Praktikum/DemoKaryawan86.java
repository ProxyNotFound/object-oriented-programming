package Bab8.Praktikum;

import java.util.Scanner;
public class DemoKaryawan86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SISTEM PENGGAJIAN ===");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilih jenis karyawan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();
        Karyawan82 karyawan;
        if (pilihan == 1) {
            System.out.print("Masukkan tunjangan: ");
            double tunjangan = input.nextDouble();
            karyawan = new KaryawanTetap82(nama, gajiPokok, tunjangan);
        } else if (pilihan == 2) {
            System.out.print("Masukkan bonus proyek: ");
            double bonus = input.nextDouble();
            karyawan = new KaryawanKontrak82(nama, gajiPokok, bonus);
        } else {
            System.out.println("Pilihan tidak valid");
            input.close();
            return;
        }
        System.out.println("\n=== SLIP GAJI ===");
        karyawan.tampilkanInfo();
        input.close();
    }
}
