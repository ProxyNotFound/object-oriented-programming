package Bab9.Praktikum;
public class DemoDokumen {
    public static void main(String[] args) {
        Laporan laporan = new Laporan("Laporan Keuangan");
        Foto foto = new Foto("Liburan.jpg");
        laporan.cetak();
        laporan.simpan();
        foto.cetak();
        Cetak c = laporan;
        Simpan s = laporan;
        c.cetak();
        s.simpan();
    }
}
