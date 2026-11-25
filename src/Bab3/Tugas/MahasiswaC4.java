package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaC4 {
    String nama;
    int semester;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | Semester: " + semester);
    }
}

class MainC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaC4[] daftar = new MahasiswaC4[3];

        for (int i = 0; i < daftar.length; i++) {
            MahasiswaC4 m = new MahasiswaC4();

            System.out.println("--- Data ContohPublic.Mahasiswa " + (i + 1) + " ---");

            System.out.print("Nama: ");
            m.nama = sc.nextLine();

            System.out.print("Semester: ");
            m.semester = sc.nextInt();
            sc.nextLine();

            daftar[i] = m;
        }

        System.out.println("\n=== Data Seluruh ContohPublic.Mahasiswa ===");

        for (MahasiswaC4 m : daftar) {
            m.tampilkanInfo();
        }

        MahasiswaC4 terbesar = daftar[0];

        for (int i = 1; i < daftar.length; i++) {
            if (daftar[i].semester > terbesar.semester) {
                terbesar = daftar[i];
            }
        }

        System.out.println("\n=== Semester Terbesar ===");
        terbesar.tampilkanInfo();

        sc.close();
    }
}