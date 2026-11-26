package Bab8.Praktikum;
public class DemoKaryawanSederhana82 {
    public static void main(String[] args) {
        KaryawanTetap82 tetap = new KaryawanTetap82("Budi", 5000000, 1000000);
        KaryawanKontrak82 kontrak = new KaryawanKontrak82("Siti", 4000000, 750000);
        tetap.tampilkanInfo();
        System.out.println();
        kontrak.tampilkanInfo();
    }
}
