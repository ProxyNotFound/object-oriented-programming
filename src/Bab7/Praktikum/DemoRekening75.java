package Bab7.Praktikum;

public class DemoRekening75 {
    public static void main(String[] args) {
        RekeningBank75 rekening = new RekeningBank75(100000);
        rekening.setor(50000);
        rekening.tarik(25000);
        System.out.println("Saldo akhir: " + rekening.getSaldo());
    }
}
