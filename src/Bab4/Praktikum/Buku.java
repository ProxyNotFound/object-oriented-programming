package Bab4.Praktikum;

public class Buku {
    String judul;
    String penulis;

    Buku() {
        judul = "Pemrograman Java";
        penulis = "Tim Pemrograman";
    }

    void tampilkanInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.tampilkanInfo();
    }
}