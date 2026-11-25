package Bab9.Praktikum;

public interface Notifikasi {
    String AWALAN = "[NOTIF] ";
    void kirim(String pesan);
    default void kirimSambutan(String nama) {
        kirim("Selamat datang, " + nama + "!");
    }
    static boolean pesanValid(String pesan) {
        return pesan != null && !pesan.trim().isEmpty();
    }
}

