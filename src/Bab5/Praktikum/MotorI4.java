package Bab5.Praktikum;

public class MotorI4 extends KendaraanI4{

    int kapasitasMesin;

    MotorI4(String merk, String warna, int kapasitasMesin){
        super(merk, warna);
        this.kapasitasMesin = kapasitasMesin;
    }

    void tampilkanMotorI4(){
        tampilkanInfo();
        System.out.println(
                "Kapasitas Mesin: " + kapasitasMesin + " cc"
        );
    }
}
