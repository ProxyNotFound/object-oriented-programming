package Bab9.Tugas;
import java.util.ArrayList;
import java.util.Scanner;
public class DemoSmartHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Perangkat> daftar = new ArrayList<>();

        daftar.add(new Lampu("Lampu Ruang Tamu"));
        daftar.add(new KipasAngin("Kipas Kamar"));
        daftar.add(new Cctv("CCTV Garasi"));

        int pilihan;

        do {
            System.out.println("\n=== SISTEM SMART HOME ===");
            System.out.println("1. Tampilkan Semua Perangkat");
            System.out.println("2. Nyalakan Perangkat");
            System.out.println("3. Matikan Perangkat");
            System.out.println("4. Atur Nilai Perangkat");
            System.out.println("5. Reset Perangkat");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("\n=== DAFTAR PERANGKAT ===");

                for (int i = 0; i < daftar.size(); i++) {
                    Perangkat p = daftar.get(i);

                    System.out.println((i + 1) + ". " + p.getNama()
                            + " - " + (p.isMenyala() ? "Menyala" : "Mati"));

                    if (p instanceof DapatDiatur) {
                        DapatDiatur d = (DapatDiatur) p;
                        System.out.println("   Nilai: " + d.getNilai());
                    }
                }

            } else if (pilihan >= 2 && pilihan <= 5) {
                System.out.println("\n=== PILIH PERANGKAT ===");

                for (int i = 0; i < daftar.size(); i++) {
                    System.out.println((i + 1) + ". " + daftar.get(i).getNama());
                }

                System.out.print("Pilih nomor perangkat: ");
                int nomor = input.nextInt();

                if (nomor < 1 || nomor > daftar.size()) {
                    System.out.println("Nomor perangkat tidak valid");
                    continue;
                }

                Perangkat p = daftar.get(nomor - 1);

                if (pilihan == 2) {
                    p.nyalakan();

                } else if (pilihan == 3) {
                    p.matikan();

                } else if (pilihan == 4) {
                    if (p instanceof DapatDiatur) {
                        DapatDiatur d = (DapatDiatur) p;

                        System.out.print("Masukkan nilai: ");
                        int nilai = input.nextInt();

                        d.aturNilai(nilai);
                    } else {
                        System.out.println("Perangkat ini tidak dapat diatur");
                    }

                } else if (pilihan == 5) {
                    if (p instanceof DapatDiatur) {
                        DapatDiatur d = (DapatDiatur) p;
                        d.reset();
                        System.out.println("Nilai perangkat berhasil direset");
                    } else {
                        System.out.println("Perangkat ini tidak dapat diatur");
                    }
                }

            } else if (pilihan == 6) {
                System.out.println("Terima kasih telah menggunakan Smart Home");

            } else {
                System.out.println("Pilihan menu tidak valid");
            }

        } while (pilihan != 6);

        input.close();
    }
}
