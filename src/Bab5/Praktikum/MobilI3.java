package Bab5.Praktikum;

public class MobilI3 extends KendaraanI3{
    int jumlahPintu;
    MobilI3(String merk,String warna,int jumlahPintu){
        super(merk,warna);
        this.jumlahPintu=jumlahPintu;
    }
    void tampilkanMobilI3(){
        tampilkanInfo();
        System.out.println("Jumlah Pintu:"+ jumlahPintu);
    }
}
