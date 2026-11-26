package Bab9.Tugas;
public class Cctv implements Perangkat {
    private String nama;
    private boolean menyala;

    public Cctv(String nama) {
        this.nama = nama;
        this.menyala = false;
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
}
