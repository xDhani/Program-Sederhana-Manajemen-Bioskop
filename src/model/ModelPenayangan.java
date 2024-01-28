package model;
import entity.*;
import java.util.ArrayList;

public class ModelPenayangan {
    public ArrayList<Penayangan> listPenayangan ;
    public ModelPenayangan(){
        this.listPenayangan = new ArrayList<>();
    }

    public void addTayang(Film film, Studio studio, String time, int ticketPrice){
        listPenayangan.add(new Penayangan(film,studio,time,ticketPrice));
    }

    public void viewAllTayang(){
        for (int i = 0; i < listPenayangan.size();i++){
            listPenayangan.get(i).viewPenayangan();
        }
    }
}
