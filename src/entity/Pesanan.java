package entity;

public class Pesanan {
    private Pengunjung pengunjung;
    private Penayangan jamtayangan;

    public Pesanan(Pengunjung pengunjung, Penayangan jamtayangan) {
        this.pengunjung = pengunjung;
        this.jamtayangan = jamtayangan;
    }


    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }



    public Penayangan getJamtayangan() {
        return jamtayangan;
    }

    public void setJamtayangan(Penayangan jamtayangan) {
        this.jamtayangan = jamtayangan;
    }



    public void viewPesanan(){
        System.out.println("nama pengunjung : "+pengunjung.getNama());
        System.out.println("nama film :"+jamtayangan.film.getTitle());
        System.out.println("jam tayang : "+jamtayangan.getTime());
        System.out.println("Studio ke - "+jamtayangan.studio.getKode());
    }
}