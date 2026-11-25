package Bab9.Praktikum;
public class DemoKaryawanBonus {
    public static void main(String[] args) {
        Karyawan[] daftar = {
                new KaryawanTetap("Budi", 5000000),
                new KaryawanKontrak("Siti", 4000000)
        };
        for (Karyawan k : daftar) {
            k.tampilkanInfo();
            if (k instanceof PenerimaBonus) {
                PenerimaBonus pb = (PenerimaBonus) k;
                System.out.println("Bonus: Rp" + pb.hitungBonus());
            } else {
                System.out.println("Tidak menerima bonus");
            }
            System.out.println();
        }
    }
}