package Bab7.Praktikum;

public class Produk76 {
    private String nama;
    private double harga;
    public Produk76(String nama, double harga) {
        this.nama = nama;
        if (harga >= 0) {
            this.harga = harga;
        } else {
            this.harga = 0;
        }
    }
    public void tampilkanInfo() {
        System.out.println("Nama produk: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}
