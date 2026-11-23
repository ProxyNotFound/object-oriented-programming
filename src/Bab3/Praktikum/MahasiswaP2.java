package Bab3.Praktikum;

import java.util.Scanner;

public class MahasiswaP2 {
    String nim;
    String nama;
    String programStudi;
    int semester;

    void tampilkanInfo() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Semester      : " + semester);
    }
}

class MainP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MahasiswaP2 mhs1 = new MahasiswaP2();

        System.out.print("Masukkan NIM          : ");
        mhs1.nim = input.nextLine();

        System.out.print("Masukkan Nama         : ");
        mhs1.nama = input.nextLine();

        System.out.print("Masukkan Program Studi : ");
        mhs1.programStudi = input.nextLine();

        System.out.print("Masukkan Semester     : ");
        mhs1.semester = input.nextInt();

        mhs1.tampilkanInfo();

        input.close();
    }
}