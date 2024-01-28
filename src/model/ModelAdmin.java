package model;

import entity.Admin;
import java.util.ArrayList;

public class ModelAdmin {
    public ArrayList<Admin> adminArrayList;

    public ModelAdmin(){
        adminArrayList = new ArrayList<>();
    }

    public void addAdmin(String nama,String pass,String nik){
        adminArrayList.add(new Admin(nama,pass,nik));
    }

    public void viewallAdmin(){
        for (int i = 0; i < adminArrayList.size();i++){
            adminArrayList.get(i).viewAdmin();
        }
    }

}
