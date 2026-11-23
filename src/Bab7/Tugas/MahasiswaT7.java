package Bab7.Tugas;
public class MahasiswaT7 {
    private String nim;
    private String nama;
    private double ipk;

    public MahasiswaT7(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        setIpk(ipk);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("[Sistem] Gagal: IPK harus berada dalam rentang 0 sampai 4.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("\n--- DATA MAHASISWA ---");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
        System.out.println("----------------------");
    }
}

