package model;

import entity.Pengunjung;

import java.util.ArrayList;

public class ModelPengunjung {
    public ArrayList<Pengunjung> pengunjunList;

    public ModelPengunjung(){
        this.pengunjunList = new ArrayList<>();
    }

    public void addPengunjung(String nama,String telp){
        pengunjunList.add(new Pengunjung(nama,telp));
    }

    public void viewallAdmin(){
        for (int i = 0; i < pengunjunList.size();i++){
            pengunjunList.get(i).viewPengunjung();
        }
    }
}
