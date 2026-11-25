package Bab3.Tugas;

import java.util.Scanner;

public class NilaiMahasiswaC5 {
    String nama;
    double tugas;
    double uts;
    double uas;

    double hitungNilaiAkhir() {
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    String tentukanKategori(double nilaiAkhir) {
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 75) return "B";
        else if (nilaiAkhir >= 50) return "C";
        else return "D";
    }

    void tampilkanHasil() {
        double akhir = hitungNilaiAkhir();

        System.out.println("Nama: " + nama);
        System.out.printf("Nilai Akhir: %.2f%n", akhir);
        System.out.println("Kategori: " + tentukanKategori(akhir));
    }
}

class MainC5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        NilaiMahasiswaC5 n = new NilaiMahasiswaC5();

        System.out.print("Nama: ");
        n.nama = scan.nextLine();

        System.out.print("Nilai Tugas (bobot 30%):");
        n.tugas = scan.nextDouble();

        System.out.print("Nilai UTS (bobot 30%):");
        n.uts = scan.nextDouble();

        System.out.print("Nilai UAS (bobot 40%):");
        n.uas = scan.nextDouble();

        System.out.println("\n=== Hasil Akhir ===");
        n.tampilkanHasil();

        scan.close();
    }
}