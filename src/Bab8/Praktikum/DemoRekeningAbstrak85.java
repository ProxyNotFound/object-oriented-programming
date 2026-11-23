package Bab8.Praktikum;

public class DemoRekeningAbstrak85 {
    public static void main(String[] args) {
        RekeningTabungan85 tabungan = new RekeningTabungan85("T-001", 100000);
        tabungan.setor(50000);
        tabungan.tarik(20000);
        System.out.println("Saldo " + tabungan.getNomor() + ": " +
                tabungan.getSaldo());
        RekeningGiro85 giro = new RekeningGiro85("G-001", 200000);
        giro.tarik(50000);
        giro.tarik(200000);
        System.out.println("Saldo " + giro.getNomor() + ": " + giro.getSaldo());
    }
}
