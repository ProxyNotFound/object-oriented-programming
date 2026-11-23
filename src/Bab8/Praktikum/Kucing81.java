package Bab8.Praktikum;

public class Kucing81 extends Hewan81 {
    public Kucing81(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara: Meong");
    }
}
