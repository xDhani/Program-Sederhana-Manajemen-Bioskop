package model;

import entity.*;

import java.util.ArrayList;

public class ModelPesan {
    public ArrayList<Pesanan> listpesan;
    ModelFilm modelFilm = new ModelFilm();
    public ModelPesan(){
        this.listpesan = new ArrayList<>();
    }

    public void addPesan(String pengunjung, String notel, String film, String jamtayangan, int studio){
        Pengunjung pengunjung1 = new Pengunjung(pengunjung, notel);
        Film film1 = modelFilm.Searchfilm(film);
        Studio studio1 = new Studio(studio);
        Penayangan penayangan = new Penayangan(film1,studio1, jamtayangan,300 );
        listpesan.add(new Pesanan(pengunjung1,penayangan));
    }
    public void viewallPesanan(){
        for (int i = 0; i < listpesan.size();i++){
            listpesan.get(i).viewPesanan();
        }
    }
}
