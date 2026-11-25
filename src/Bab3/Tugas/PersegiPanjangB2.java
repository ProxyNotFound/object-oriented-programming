package Bab3.Tugas;

import java.util.Scanner;

public class PersegiPanjangB2 {
    double panjang;
    double lebar;

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class MainB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersegiPanjangB2 pp = new PersegiPanjangB2();

        System.out.print("Panjang: ");
        pp.panjang = sc.nextDouble();

        System.out.print("Lebar: ");
        pp.lebar = sc.nextDouble();

        System.out.println("Luas     = " + pp.hitungLuas());
        System.out.println("Keliling = " + pp.hitungKeliling());

        sc.close();
    }
}