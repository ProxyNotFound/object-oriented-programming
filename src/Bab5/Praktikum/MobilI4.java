package Bab5.Praktikum;

public class MobilI4 extends KendaraanI4{
    int jumlahPintu;

    MobilI4(String merk,String warna,int jumlahPintu){
        super(merk,warna);
        this.jumlahPintu=jumlahPintu;
    }

    void tampilkanMobilI4(){
        tampilkanInfo();
        System.out.println("Jumlah Pintu: "+jumlahPintu);
    }
}
