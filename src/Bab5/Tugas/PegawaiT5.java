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

    public static class PegawaiTetapT5 extends PegawaiT5 {
        double gajiPokok; // Tambahkan atribut gajiPokok di sini
        double tunjangan;

        PegawaiTetapT5(
                String nama,
                String id,        // Tambahkan parameter id
                double gajiPokok,
                double tunjangan
        ) {
            super(nama, id);      // Teruskan nama dan id ke PegawaiT5
            this.gajiPokok = gajiPokok;
            this.tunjangan = tunjangan;
        }

        double hitungTotalGaji() {
            return gajiPokok + tunjangan;
        }

        void tampilkanGaji() {
            tampilkanInfo();
            System.out.println("Gaji Pokok: " + gajiPokok);
            System.out.println("Tunjangan : " + tunjangan);
            System.out.println("Total Gaji: " + hitungTotalGaji());
        }
    }
}
