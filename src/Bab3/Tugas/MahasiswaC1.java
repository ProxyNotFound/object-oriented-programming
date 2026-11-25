package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaC1 {
    String nama;
    int semester;
    double ipk;

    String predikatIPK() {
        if (ipk >= 3.5) return "Cumlaude";
        else if (ipk >= 3.0) return "Sangat Memuaskan";
        else if (ipk >= 2.5) return "Memuaskan";
        else return "Perlu Peningkatan";
    }
}

class MainC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaC1 m = new MahasiswaC1();

        System.out.print("Nama: ");
        m.nama = sc.nextLine();

        System.out.print("Semester: ");
        m.semester = sc.nextInt();

        System.out.print("IPK: ");
        m.ipk = sc.nextDouble();

        System.out.println("Nama       : " + m.nama);
        System.out.println("Semester : " + m.semester);
        System.out.println("IPK       : " + m.ipk);
        System.out.println("Predikat   : " + m.predikatIPK());

        sc.close();
    }
}