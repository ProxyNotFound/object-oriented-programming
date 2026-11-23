package Bab5.Tugas;

public class PegawaiT5 {
    protected String nama;
    protected String id;
    public PegawaiT5(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void tampilkanInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
    }

    public double hitungPendapatan() {
        return 0;
    }

    public static class PegawaiTetapI5 extends PegawaiI5 {
        double tunjangan;
        PegawaiTetapI5(
                String nama,
                double gajiPokok,
                double tunjangan
        ) {
            super(nama, gajiPokok);
            this.tunjangan = tunjangan;
        }
        double hitungTotalGaji() {
            return gajiPokok + tunjangan;
        }
        void tampilkanGaji() {
            tampilkanInfo();
            System.out.println("Tunjangan : " + tunjangan);
            System.out.println("Total Gaji: " + hitungTotalGaji());
        }
    }
}