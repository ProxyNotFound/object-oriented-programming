package Bab5.Praktikum;

public class KendaraanI4 {
    String merk;
    String warna;

    KendaraanI4(String merk, String warna){
        this.merk = merk;
        this.warna = warna;
    }
    void tampilkanInfo(){
        System.out.println("Merk: "+this.merk);
        System.out.println("Warna: "+this.warna);
    }
}
