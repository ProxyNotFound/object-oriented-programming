package Bab3.Tugas;

import java.util.Scanner;

public class PersegiA4 {
    double sisi;

    double hitungLuas() {
        return sisi * sisi;
    }
}

class MainA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersegiA4 p = new PersegiA4();

        System.out.print("Masukkan sisi persegi: ");
        p.sisi = sc.nextDouble();

        System.out.println("Luas persegi = " + p.hitungLuas());

        sc.close();
    }
}