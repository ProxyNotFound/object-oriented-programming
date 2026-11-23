package Bab6.Praktikum;

public class DemoBangunDatar6 {
    public static void main(String[] args) {
        BangunDatar6 bangun1 = new Persegi6(7);
        BangunDatar6 bangun2 = new PersegiPanjang6(14, 7);
        System.out.println("=== PERSEGI ===");
        bangun1.tampilkanLuas();
        System.out.println("\n=== PERSEGI PANJANG ===");
        bangun2.tampilkanLuas();
    }
}