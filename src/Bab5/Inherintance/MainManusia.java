package Bab5.Inherintance;

public class MainManusia {
    public static void main(String[] args) {

        Mahasiswa5I mahasiswa = new Mahasiswa5I();

        mahasiswa.nama = "Daffa";
        mahasiswa.usia = 19;
        mahasiswa.nim = "1202507007";

        System.out.println("=== DATA MAHASISWA ===");
        mahasiswa.tampilkanInfo();
        System.out.println("NIM : " + mahasiswa.nim);
        mahasiswa.belajar();

        System.out.println();

        Dosen dosen = new Dosen();

        dosen.nama = "Bayu";
        dosen.usia = 40;
        dosen.nidn = "0123456789";

        System.out.println("=== DATA DOSEN ===");
        dosen.tampilkanInfo();
        System.out.println("NIDN : " + dosen.nidn);
        dosen.mengajar();
    }
}