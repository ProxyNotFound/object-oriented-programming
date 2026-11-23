package Bab5.Praktikum;

import java.util.Scanner;
public class DemoMobilI5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- INPUT DATA MOBIL ---");
        System.out.print("Masukkan merk       : ");
        String merkMobil = input.nextLine();
        System.out.print("Masukkan warna      : ");
        String warnaMobil = input.nextLine();
        System.out.print("Masukkan tahun      : ");
        int tahunMobil = input.nextInt();
        System.out.print("Masukkan jumlah pintu: ");
        int pintu = input.nextInt();
        input.nextLine();

        MobilI5 mobil = new MobilI5(merkMobil, warnaMobil, tahunMobil, pintu);
        mobil.tampilkanMobilI5();

        System.out.println("\n-------------------------------\n");

        System.out.println("--- INPUT DATA MOTOR ---");
        System.out.print("Masukkan merk       : ");
        String merkMotor = input.nextLine();
        System.out.print("Masukkan warna      : ");
        String warnaMotor = input.nextLine();
        System.out.print("Masukkan tahun      : ");
        int tahunMotor = input.nextInt();
        System.out.print("Masukkan kapasitas cc: ");
        int cc = input.nextInt();

        MotorI5 motor = new MotorI5(merkMotor, warnaMotor, tahunMotor, cc);
        motor.tampilkanMotorI5();

        input.close();
    }
}
