package entity;

public class Admin extends User {

    public Admin(String nama, String pass, String nik) {
        this.nama = nama;
        this.pass = pass;
        this.nik = nik;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public String getNik() {
        return nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void viewAdmin(){
        System.out.println("nama : "+nama);
        System.out.println("pass : "+pass);
        System.out.println("nik : "+nik);
    }
}
