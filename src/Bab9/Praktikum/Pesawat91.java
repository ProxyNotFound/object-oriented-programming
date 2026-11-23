package Bab9.Praktikum;

public class Pesawat91 implements Terbang91 {
    private String kode;
    public Pesawat91(String kode) {
        this.kode = kode;
    }
    @Override
    public void terbang() {
        System.out.println("Pesawat " + kode + " terbang dengan mesin jet");
    }
    @Override
    public void mendarat() {
        System.out.println("Pesawat " + kode + " mendarat di landasan");
    }
}
