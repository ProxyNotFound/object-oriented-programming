package Bab5.Tugas;

import java.util.ArrayList;
import java.util.Scanner;
public class MainPegawaiT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PegawaiT5> daftarPegawai = new ArrayList<>();
        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEGAWAI ===");
            System.out.println("1. Tambah Pegawai Tetap");
            System.out.println("2. Tambah Pegawai Kontrak");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Hitung Pendapatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Pegawai Tetap ---");

                    System.out.print("Nama: ");
                    String namaTetap = scanner.nextLine();

                    System.out.print("ID: ");
                    String idTetap = scanner.nextLine();

                    System.out.print("Gaji Bulanan: Rp");
                    double gajiTetap = scanner.nextDouble();

                    daftarPegawai.add(
                            new PegawaiTetapT5(
                                    namaTetap,
                                    idTetap,
                                    gajiTetap
                            )
                    );

                    System.out.println("Pegawai tetap berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n--- Tambah Pegawai Kontrak ---");

                    System.out.print("Nama: ");
                    String namaKontrak = scanner.nextLine();

                    System.out.print("ID: ");
                    String idKontrak = scanner.nextLine();

                    System.out.print("Gaji Bulanan: Rp");
                    double gajiKontrak = scanner.nextDouble();

                    System.out.print("Lama Kontrak (bulan): ");
                    int lamaKontrak = scanner.nextInt();

                    daftarPegawai.add(
                            new PegawaiKontrakT5(
                                    namaKontrak,
                                    idKontrak,
                                    gajiKontrak,
                                    lamaKontrak
                            )
                    );

                    System.out.println("Pegawai kontrak berhasil ditambahkan.");
                    break;

                case 3:
                    System.out.println("\n=== DATA PEGAWAI ===");

                    if (daftarPegawai.isEmpty()) {
                        System.out.println("Belum ada data pegawai.");
                    } else {
                        for (int i = 0; i < daftarPegawai.size(); i++) {
                            System.out.println("\nPegawai ke-" + (i + 1));
                            daftarPegawai.get(i).tampilkanInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== TOTAL PENDAPATAN ===");

                    if (daftarPegawai.isEmpty()) {
                        System.out.println("Belum ada data pegawai.");
                    } else {
                        double total = 0;

                        for (PegawaiT5 pegawai : daftarPegawai) {
                            total += pegawai.hitungPendapatan();
                        }

                        System.out.println("Total Pendapatan: Rp" + total);
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}