package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaD2 {
    String nama;
    String nim;

    void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
    }
}

class NilaiD2 {
    double tugas;
    double uts;
    double uas;

    double hitungNilaiAkhir() {
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    String tentukanKategori() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 90) return "A";
        else if (nilaiAkhir >= 80) return "B";
        else if (nilaiAkhir >= 75) return "C";
        else if (nilaiAkhir >= 50) return "D";
        else return "E";
    }

    void tampilkanHasil() {
        System.out.printf("Nilai Akhir: %.2f%n", hitungNilaiAkhir());
        System.out.println("Kategori: " + tentukanKategori());
    }
}

class MainD2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MahasiswaD2 m = new MahasiswaD2();

        System.out.print("Nama:");
        m.nama = scan.nextLine();

        System.out.print("Nim:");
        m.nim = scan.nextLine();

        NilaiD2 n = new NilaiD2();

        System.out.print("Nilai Tugas (bobot 30%):");
        n.tugas = scan.nextDouble();

        System.out.print("Nilai UTS (bobot 30%):");
        n.uts = scan.nextDouble();

        System.out.print("Nilai UAS (bobot 40%):");
        n.uas = scan.nextDouble();

        System.out.println("\n===HASIL AKHIR===");

        m.tampilkanBiodata();
        n.tampilkanHasil();

        scan.close();
    }
}