package Bab7.Tugas;
import java.util.Scanner;
public class DemoMahasiswaT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA AWAL MAHASISWA ===");
        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = input.nextDouble();

        MahasiswaT7 mhs = new MahasiswaT7(nim, nama, ipk);
        mhs.tampilkanInfo();

        int menu;
        do {
            System.out.println("\n=== SISTEM INFORMASI MAHASISWA ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Ubah Nama");
            System.out.println("3. Ubah IPK");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    mhs.tampilkanInfo();
                    break;
                case 2:
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru = input.nextLine();
                    mhs.setNama(namaBaru);
                    System.out.println("[Sistem] Nama berhasil diperbarui.");
                    mhs.tampilkanInfo();
                    break;
                case 3:
                    System.out.print("Masukkan IPK Baru: ");
                    double ipkBaru = input.nextDouble();
                    mhs.setIpk(ipkBaru);
                    mhs.tampilkanInfo();
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 4);

        input.close();
    }
}
