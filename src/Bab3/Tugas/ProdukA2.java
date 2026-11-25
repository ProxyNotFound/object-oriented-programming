package Bab3.Tugas;

public class ProdukA2 {
    String nama;
    double harga;

    void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
    }
}

class MainA2 {
    public static void main(String[] args) {
        ProdukA2 p1 = new ProdukA2();

        p1.nama = "Good Day";
        p1.harga = 2500;

        p1.tampilkanInfo();
    }
}