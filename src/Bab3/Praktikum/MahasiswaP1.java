package Bab3.Praktikum;

public class MahasiswaP1 {
    String nim;
    String nama;
    int semester;

    void tampilkanInfo() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Semester  : " + semester);
    }
}

class MainP1 {
    public static void main(String[] args) {
        MahasiswaP1 mhs1 = new MahasiswaP1();

        mhs1.nim = "1202507007";
        mhs1.nama = "Daffa";
        mhs1.semester = 4;

        mhs1.tampilkanInfo();
    }
}