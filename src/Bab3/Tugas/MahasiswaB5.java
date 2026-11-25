package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaB5 {
    String nama;
    int semester;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | Semester: " + semester);
    }
}

class MainB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaB5 m1 = new MahasiswaB5();

        System.out.println("--- Data ContohPublic.Mahasiswa 1 ---");

        System.out.print("Nama: ");
        m1.nama = sc.nextLine();

        System.out.print("Semester: ");
        m1.semester = sc.nextInt();
        sc.nextLine();

        MahasiswaB5 m2 = new MahasiswaB5();

        System.out.println("--- Data ContohPublic.Mahasiswa 2 ---");

        System.out.print("Nama: ");
        m2.nama = sc.nextLine();

        System.out.print("Semester: ");
        m2.semester = sc.nextInt();

        System.out.println("\n=== Data Lengkap ===");

        m1.tampilkanInfo();
        m2.tampilkanInfo();

        System.out.println("\n=== Perbandingan ===");

        if (m1.semester > m2.semester) {
            System.out.println(m1.nama + " semesternya lebih tinggi.");
        } else if (m1.semester < m2.semester) {
            System.out.println(m2.nama + " semesternya lebih tinggi.");
        } else {
            System.out.println("Semester keduanya sama.");
        }

        sc.close();
    }
}