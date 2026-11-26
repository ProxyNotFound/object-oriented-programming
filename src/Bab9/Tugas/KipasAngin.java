package Bab9.Tugas;
public class KipasAngin implements Perangkat, DapatDiatur {
    private String nama;
    private boolean menyala;
    private int nilai;

    public KipasAngin(String nama) {
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
        } else if (nilai < 0 || nilai > 3) {
            System.out.println("Kecepatan harus antara 0 sampai 3");
        } else {
            this.nilai = nilai;
            System.out.println("Kecepatan " + nama + " diatur menjadi " + nilai);
        }
    }

    @Override
    public int getNilai() {
        return nilai;
    }
}
