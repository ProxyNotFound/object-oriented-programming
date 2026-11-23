package Bab4.Praktikum;

public class PersegiPanjang {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas(){
        return panjang*lebar;
    }

    double hitungKeliling(){
        return 2 * (panjang+lebar);
    }

    void tampilkanHasil(){
        System.out.println("Panjang: "+ panjang);
        System.out.println("Lebar: "+ lebar);
        System.out.println("Luas: "+ hitungLuas());
        System.out.println("Keliling: "+ hitungKeliling());
    }
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10,5);
        pp.tampilkanHasil();
    }
}