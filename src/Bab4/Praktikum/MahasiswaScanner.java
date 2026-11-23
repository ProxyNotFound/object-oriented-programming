package Bab4.Praktikum;

import java.util.Scanner;
public class MahasiswaScanner {
    String nim;
    String nama;
    int semester;
    double ipk;

    MahasiswaScanner(String nim, String nama, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }
    void tampilkanInfo(){
        System.out.println("\n === DATA MAHASISWA ===");
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Semester: "+semester);
        System.out.println("IPK: "+ipk);
    }
    void tampilkanStatus() {
        System.out.print("Status Akademik: ");
        if (semester >= 1 && semester <= 2) {
            System.out.println("ContohPublic.Mahasiswa Baru / Awal");
        } else if (semester >= 3 && semester <= 6) {
            System.out.println("ContohPublic.Mahasiswa Tingkat Kedua / Menengah");
        } else if (semester >= 7 && semester <= 8) {
            System.out.println("ContohPublic.Mahasiswa Tingkat Akhir (Siap Lulus)");
        } else if (semester > 8 && semester <= 14) {
            System.out.println("Masa Perpanjangan Studi / Semester Tua");
        } else {
            System.out.println("Semester Tidak Valid / Drop Out");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Semester : ");
        int semester = input.nextInt();
        System.out.print("Masukkan IPK : ");
        double ipk = input.nextDouble();

        MahasiswaScanner mhs = new MahasiswaScanner(nim, nama, semester,ipk);
        mhs.tampilkanInfo();
        mhs.tampilkanStatus();
        input.close();
    }
}