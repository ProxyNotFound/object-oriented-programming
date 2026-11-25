package Bab3.Tugas;

import java.util.Scanner;

public class RekeningC3 {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.println("No. Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Saldo        : Rp" + saldo);
    }

    void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setoran tidak valid.");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor Rp" + jumlah +
                " berhasil. Saldo sekarang: Rp" + saldo);
    }

    void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid.");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi. Penarikan dibatalkan.");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik Rp" + jumlah +
                    " berhasil. Saldo sekarang: Rp" + saldo);
        }
    }
}

class MainC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RekeningC3 r = new RekeningC3();

        System.out.print("No. Rekening: ");
        r.nomorRekening = sc.nextLine();

        System.out.print("Nama Pemilik: ");
        r.namaPemilik = sc.nextLine();

        System.out.print("Saldo Awal: ");
        r.saldo = sc.nextDouble();

        System.out.print("Jumlah setor: ");
        r.setor(sc.nextDouble());

        System.out.print("Jumlah tarik: ");
        r.tarik(sc.nextDouble());

        System.out.println("\n=== Info Akhir ===");
        r.tampilkanInfo();

        sc.close();
    }
}