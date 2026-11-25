package Bab3.Tugas;

import java.util.Scanner;

public class KendaraanA5 {
    String merk;
    String warna;
    int tahun;

    void tampilkanInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }
}

class MainA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KendaraanA5 k = new KendaraanA5();

        System.out.print("Merk: ");
        k.merk = sc.nextLine();

        System.out.print("Warna: ");
        k.warna = sc.nextLine();

        System.out.print("Tahun: ");
        k.tahun = sc.nextInt();

        k.tampilkanInfo();

        sc.close();
    }
}