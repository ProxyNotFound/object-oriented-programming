package Bab5.Inherintance;

public class MainHewan {
    public static void main(String[] args) {

        Burung burung = new Burung();
        Ikan ikan = new Ikan();

        System.out.println("=== SUARA HEWAN ===");

        System.out.println("Burung:");
        burung.suara();

        System.out.println();

        System.out.println("Ikan:");
        ikan.suara();
    }
}