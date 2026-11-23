package Bab4.Praktikum;

public class Produk {
    String nama;
    double harga;

    Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanInfo(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Harga: " + this.harga);
    }

    public static void main(String[] args) {
        Produk p1 = new Produk("Keyboard", 250000);
        Produk p2 = new Produk("Mouse", 150000);
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
    }
}