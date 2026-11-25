package Bab3.Tugas;

import java.util.Scanner;

public class RekeningB3 {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.println("No. Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Saldo        : Rp" + saldo);
    }

    void setSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Saldo bertambah Rp" + jumlah);
    }
}

class MainB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RekeningB3 r = new RekeningB3();

        System.out.print("No. Rekening: ");
        r.nomorRekening = sc.nextLine();

        System.out.print("Nama Pemilik: ");
        r.namaPemilik = sc.nextLine();

        System.out.print("Saldo Awal: ");
        r.saldo = sc.nextDouble();

        System.out.print("Jumlah setoran: ");
        double jumlah = sc.nextDouble();

        r.setSaldo(jumlah);

        r.tampilkanInfo();

        sc.close();
    }
}