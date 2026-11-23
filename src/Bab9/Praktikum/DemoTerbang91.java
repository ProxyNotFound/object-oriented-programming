package Bab9.Praktikum;

public class DemoTerbang91 {
    public static void main(String[] args) {
        Burung91 burung91 = new Burung91("Elang");
        Pesawat91 pesawat91 = new Pesawat91("GA-101");
        burung91.terbang();
        burung91.mendarat();
        pesawat91.terbang();
        pesawat91.mendarat();
    }
}
