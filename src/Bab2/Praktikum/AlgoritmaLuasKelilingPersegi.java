package Bab2.Praktikum;

import java.util.Scanner;

public class AlgoritmaLuasKelilingPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        int sisi = input.nextInt();

        int keliling = 4 * sisi;
        int luas = sisi * sisi;

        System.out.println("Panjang sisi persegi = " + sisi + " cm");
        System.out.println("Keliling persegi = " + keliling + " cm");
        System.out.println("Luas persegi = " + luas + " cm^2");

        input.close();
    }
}