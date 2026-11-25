package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaA3 {
    String nim;
    String nama;
    String programStudi;
    int semester;

    void tampilkanInfo() {
        System.out.println("NIM:" + nim);
        System.out.println("Nama:" + nama);
        System.out.println("ProgramStudi:" + programStudi);
        System.out.println("Semester:" + semester);
    }
}

class MainA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaA3 m = new MahasiswaA3();

        System.out.print("NIM:");
        m.nim = sc.nextLine();

        System.out.print("Nama:");
        m.nama = sc.nextLine();

        System.out.print("ProgramStudi:");
        m.programStudi = sc.nextLine();

        System.out.print("Semester:");
        m.semester = sc.nextInt();

        m.tampilkanInfo();

        sc.close();
    }
}