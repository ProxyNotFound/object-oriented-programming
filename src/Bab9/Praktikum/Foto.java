package Bab9.Praktikum;

public class Foto implements Cetak {
    private String nama;
    public Foto(String nama) {
        this.nama = nama;
    }
    @Override
    public void cetak() {
        System.out.println("Mencetak foto: " + nama);
    }
}

