package model;

import entity.Film;

import java.util.ArrayList;

public class ModelFilm {
    public ArrayList<Film> filmArrayList;
    public ModelFilm(){
        this.filmArrayList = new ArrayList<>();
    }

    public void addFilm(String title, String genre){
        filmArrayList.add(new Film(title,genre));
    }

        public void viewAllFilm(){
            for (int i = 0; i < filmArrayList.size();i++){
                filmArrayList.get(i).viewFilm();
            }
        }

        public Film Searchfilm(String nama){
        for (Film pilm: filmArrayList){
            if (pilm.getTitle().equals(nama)){
                return pilm;
            }
        }
        return null;
        }
    }

