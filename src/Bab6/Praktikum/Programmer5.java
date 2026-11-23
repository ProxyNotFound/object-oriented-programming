package Bab6.Praktikum;

public class Programmer5 extends Pegawai5 {
    Programmer5(String nama) {
        super(nama);
    }
    @Override
    void tampilkanPekerjaan() {
        System.out.println("Pekerjaan: Mengembangkan perangkat lunak");
    }
}