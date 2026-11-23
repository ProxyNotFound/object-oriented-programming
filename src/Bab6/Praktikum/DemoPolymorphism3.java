package Bab6.Praktikum;

public class DemoPolymorphism3 {
    public static void main(String[] args) {
        Hewan2 hewan1 = new Kucing2();
        Hewan2 hewan2 = new Anjing2();
        hewan1.bersuara();
        hewan2.bersuara();
    }
}
