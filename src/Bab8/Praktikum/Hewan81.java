package Bab8.Praktikum;

public abstract class Hewan81 {
    protected String nama;
    public Hewan81(String nama) {
        this.nama = nama;
    }
    public abstract void suara();
    public void tampilkanNama() {
        System.out.println("Nama hewan: " + nama);
    }
}

