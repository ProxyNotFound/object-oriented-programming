package Bab8.Praktikum;

public class Anjing81 extends Hewan81 {
    public Anjing81(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara: Guk guk");
    }
}
