package Bab3.Tugas;

import java.util.Scanner;

public class KendaraanD3 {
    String merk;
    String warna;
    int tahun;
    boolean statusMesin;

    KendaraanD3() {
        statusMesin = false;
    }

    void nyalakanMesin() {
        if (statusMesin) {
            System.out.println("Mesin sudah menyala.");
        } else {
            statusMesin = true;
            System.out.println("Mesin" + merk + " berhasil dinyalakan.");
        }
    }

    void matikanMesin() {
        if (!statusMesin) {
            System.out.println("Mesin sudah mati.");
        } else {
            statusMesin = false;
            System.out.println("Mesin" + merk + " berhasil dimatikan.");
        }
    }

    void tampilkanInfo() {
        System.out.println("Merk:" + merk);
        System.out.println("Warna:" + warna);
        System.out.println("Tahun:" + tahun);
        System.out.println("Status:" + (statusMesin ? "Menyala" : "Mati"));
    }
}

class MainD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KendaraanD3 k = new KendaraanD3();

        System.out.print("Merk:");
        k.merk = sc.nextLine();

        System.out.print("Warna:");
        k.warna = sc.nextLine();

        System.out.print("Tahun:");
        k.tahun = sc.nextInt();
        sc.nextLine();

        int pilihan;

        do {
            System.out.println("\n===MENU KENDARAAN===");
            System.out.println("1. Nyalakan Mesin");
            System.out.println("2. Matikan Mesin");
            System.out.println("3. Tampilkan Info");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu:");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 -> k.nyalakanMesin();
                case 2 -> k.matikanMesin();
                case 3 -> k.tampilkanInfo();
                case 4 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 4);

        sc.close();
    }
}