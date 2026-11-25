package Bab3.Tugas;

public class BukuA1 {
    String judul;
    String penulis;
    int tahunTerbit;

    void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun terbit: " + tahunTerbit);
    }
}

class MainA1 {
    public static void main(String[] args) {
        BukuA1 buku1 = new BukuA1();

        buku1.judul = "Harry Potter and the Sorcerer's Stone";
        buku1.penulis = "J.K. Rowling";
        buku1.tahunTerbit = 1997;

        BukuA1 buku2 = new BukuA1();

        buku2.judul = "Pulang-Pergi";
        buku2.penulis = "Tere Liye";
        buku2.tahunTerbit = 2021;

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}