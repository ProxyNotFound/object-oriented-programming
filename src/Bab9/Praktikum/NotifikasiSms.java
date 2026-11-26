package Bab9.Praktikum;
public class NotifikasiSms implements Notifikasi {
    private String nomor;
    public NotifikasiSms(String nomor) {
        this.nomor = nomor;
    }
    @Override
    public void kirim(String pesan) {
        if (Notifikasi.pesanValid(pesan)) {
            System.out.println(AWALAN + "SMS ke " + nomor + ": " + pesan);
        } else {
            System.out.println("Pesan tidak boleh kosong");
        }
    }
    @Override
    public void kirimSambutan(String nama) {
        kirim("Halo " + nama + ", selamat datang!");
    }
}
