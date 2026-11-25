package Bab9.Praktikum;

public class NotifikasiEmail implements Notifikasi {
    private String alamat;
    public NotifikasiEmail(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public void kirim(String pesan) {
        if (Notifikasi.pesanValid(pesan)) {
            System.out.println(AWALAN + "Email ke " + alamat + ": " + pesan);
        } else {
            System.out.println("Pesan tidak boleh kosong");
        }
    }
}
