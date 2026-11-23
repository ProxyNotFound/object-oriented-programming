package Bab3.Praktikum;

import java.util.Scanner;

public class MahasiswaP4 {
    String nim;
    String nama;
    int semester;

    void tampilkanInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
    }

    void tampilkanStatus() {
        if (semester <= 2) {
            System.out.println("Status: ContohPublic.Mahasiswa tingkat awal");
        } else {
            System.out.println("Status: ContohPublic.Mahasiswa tingkat lanjut");
        }
    }
}

class MainP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MahasiswaP4 mhs = new MahasiswaP4();

        System.out.print("Masukkan NIM :");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama :");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan Semester :");
        mhs.semester = input.nextInt();

        mhs.tampilkanInfo();
        mhs.tampilkanStatus();

        input.close();
    }
}