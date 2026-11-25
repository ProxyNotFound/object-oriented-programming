package Bab9.Praktikum;

public class DemoNotifikasi {
    public static void main(String[] args) {
        NotifikasiEmail email = new NotifikasiEmail("andi@mail.com");
        NotifikasiSms sms = new NotifikasiSms("0812345678");
        email.kirim("Tagihan Anda sudah terbit");
        email.kirimSambutan("Andi");
        sms.kirimSambutan("Andi");
        sms.kirim("");
    }
}