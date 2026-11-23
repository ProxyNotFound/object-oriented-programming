package Bab9.Interface;

public class DemoPembayaranT9 {
    public static void main(String[] args) {
        TunaiT9 tunaiT9 = new TunaiT9();
        QrisT9 qrisT9 = new QrisT9();
        tunaiT9.bayarT9(1000000);
        qrisT9.bayarT9(2000000);
    }
}
