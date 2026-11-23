package Bab9.Praktikum;

public class Burung91 implements Terbang91 {
    private String nama;
    public Burung91(String nama) {
        this.nama = nama;
    }
    @Override
    public void terbang() {
        System.out.println(nama + " terbang dengan mengepakkan sayap");
    }
    @Override
    public void mendarat() {
        System.out.println(nama + " mendarat di dahan");
    }
}
