package Bab9.Tugas;
public class Lampu implements Perangkat, DapatDiatur {
    private String nama;
    private boolean menyala;
    private int nilai;

    public Lampu(String nama) {
        this.nama = nama;
        this.menyala = false;
        this.nilai = 0;
    }

    @Override
    public void nyalakan() {
        menyala = true;
        System.out.println(nama + " berhasil dinyalakan");
    }

    @Override
    public void matikan() {
        menyala = false;
        System.out.println(nama + " berhasil dimatikan");
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public boolean isMenyala() {
        return menyala;
    }

    @Override
    public void aturNilai(int nilai) {
        if (!menyala) {
            System.out.println("Nyalakan perangkat terlebih dahulu");
        } else if (nilai < 0 || nilai > 100) {
            System.out.println("Kecerahan harus antara 0 sampai 100");
        } else {
            this.nilai = nilai;
            System.out.println("Kecerahan " + nama + " diatur menjadi " + nilai);
        }
    }

    @Override
    public int getNilai() {
        return nilai;
    }
}
