package Bab6.Praktikum;

import java.util.Scanner;
public class DemoPegawai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pegawai: ");
        String nama = input.nextLine();
        System.out.println("Pilih jenis pegawai:");
        System.out.println("1. Dosen");
        System.out.println("2. Programmer");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        Pegawai5 pegawai5;
        if (pilihan == 1) {
            pegawai5 = new Dosen5(nama);
        } else if (pilihan == 2) {
            pegawai5 = new Programmer5(nama);
        } else {
            System.out.println("Pilihan tidak valid.");
            input.close();
            return;
        }
        System.out.println("\n=== INFORMASI PEGAWAI ===");
        pegawai5.tampilkanInfo();
        pegawai5.tampilkanPekerjaan();
        input.close();
    }
}
