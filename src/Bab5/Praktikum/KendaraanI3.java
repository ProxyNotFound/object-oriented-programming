package Bab5.Praktikum;

public class KendaraanI3 {
    String merk;
    String warna;

    KendaraanI3 (String merk, String warna){
        this.merk = merk;
        this.warna = warna;
    }

    void tampilkanInfo(){
        System.out.println("Merk: "+merk);
        System.out.println("Warna: "+warna);
    }
}
