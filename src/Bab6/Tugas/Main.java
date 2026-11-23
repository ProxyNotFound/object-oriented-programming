package Bab6.Tugas;

public class Main {
    public static void main(String[] args) {
        Shape persegi = new Persegi(7);
        Shape lingkaran = new Lingkaran(12);

        System.out.println("Luas persegi = " + persegi.hitungLuas());
        System.out.println("Luas lingkaran = " + lingkaran.hitungLuas());
    }
}