package entity;

public class Pengunjung {
    public String nama;
    public String telp;

    public Pengunjung(String nama, String telp) {
        this.nama = nama;
        this.telp = telp;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void viewPengunjung() {
        System.out.println("nama : " + nama);
        System.out.println("pass : " + telp);
    }
}
