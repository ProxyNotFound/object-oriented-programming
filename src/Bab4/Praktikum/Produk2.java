package Bab4.Praktikum;

public class Produk2 {
    String nama;
    double harga;
    Produk2(){
        nama = "Produk Baru";
        harga = 0;
    }
    Produk2(String nama){
        this.nama = nama;
        harga = 0;
    }
    Produk2(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }

    public static void main(String[] args) {
        Produk2 p1 = new Produk2();
        Produk2 p2 = new Produk2("Laptop");
        Produk2 p3 = new Produk2("Laptop", 7500000);

        System.out.println("PRODUK 1");
        p1.tampilkanInfo();

        System.out.println("\n PRODUK 2");
        p2.tampilkanInfo();

        System.out.println("\n PRODUK 3");
        p3.tampilkanInfo();
    }
}