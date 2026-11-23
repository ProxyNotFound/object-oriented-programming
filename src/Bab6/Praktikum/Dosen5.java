package Bab6.Praktikum;

public class Dosen5 extends Pegawai5 {
    Dosen5(String nama) {
        super(nama);
    }
    @Override
    void tampilkanPekerjaan() {
        System.out.println("Pekerjaan: Mengajar mahasiswa");
    }
}