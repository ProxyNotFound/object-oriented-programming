package Bab3.Praktikum;

import java.util.Scanner;

public class MahasiswaP3 {
    public String nim;
    public String nama;
    public String prodi;
    public int semester;

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Semester: " + semester);
    }
}

class MainP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MahasiswaP3 mhs1 = new MahasiswaP3();
        MahasiswaP3 mhs2 = new MahasiswaP3();

        System.out.print("NIM mahasiswa 1 : ");
        mhs1.nim = input.nextLine();

        System.out.print("Nama mahasiswa 1: ");
        mhs1.nama = input.nextLine();

        System.out.print("Prodi mahasiswa 1: ");
        mhs1.prodi = input.nextLine();

        System.out.print("Semester mhs 1: ");
        mhs1.semester = input.nextInt();
        input.nextLine();

        System.out.print("NIM mahasiswa 2 : ");
        mhs2.nim = input.nextLine();

        System.out.print("Nama mahasiswa 2: ");
        mhs2.nama = input.nextLine();

        System.out.print("Prodi mahasiswa 2: ");
        mhs2.prodi = input.nextLine();

        System.out.print("Semester mahasiswa 2: ");
        mhs2.semester = input.nextInt();

        System.out.println("\nDATA MAHASISWA 1");
        mhs1.tampilkanInfo();

        System.out.println("\nDATA MAHASISWA 2");
        mhs2.tampilkanInfo();

        input.close();
    }
}