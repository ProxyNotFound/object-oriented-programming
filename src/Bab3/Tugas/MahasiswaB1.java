package Bab3.Tugas;

import java.util.Scanner;

public class MahasiswaB1 {
    String nama;
    int semester;
    double ipk;

    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);
    }

    void tampilkanStatusIPK() {
        String status;

        if (ipk >= 3.5) {
            status = "Cumlaude";
        } else if (ipk >= 3.0) {
            status = "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            status = "Memuaskan";
        } else {
            status = "Perlu Peningkatan";
        }

        System.out.println("Status : " + status);
    }
}

class MainB1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MahasiswaB1 m = new MahasiswaB1();

        System.out.print("Nama      : ");
        m.nama = scan.nextLine();

        System.out.print("Semester  : ");
        m.semester = scan.nextInt();

        System.out.print("IPK       : ");
        m.ipk = scan.nextDouble();

        m.tampilkanInfo();
        m.tampilkanStatusIPK();

        scan.close();
    }
}