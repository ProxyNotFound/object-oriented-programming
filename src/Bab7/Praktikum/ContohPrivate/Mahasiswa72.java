package Bab7.Praktikum.ContohPrivate;

public class Mahasiswa72 {
    private String nama;
    private double ipk;
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIpk(double ipk) {
        if (ipk >= 0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid");
        }
    }
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
    }
}


