package Bab9.Praktikum;

public class Laporan implements Cetak, Simpan {
    private String judul;
    public Laporan(String judul) {
        this.judul = judul;
    }
    @Override
    public void cetak() {
        System.out.println("Mencetak laporan: " + judul);
    }
    @Override
    public void simpan() {
        System.out.println("Menyimpan laporan: " + judul + " ke file");
    }
}
