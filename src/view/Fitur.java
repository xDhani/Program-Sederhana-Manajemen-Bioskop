package view;
import model.*;
import entity.*;
import java.util.*;
public class Fitur {
    Scanner scan = new Scanner(System.in);
    public void menu(){

        System.out.println("1.tambah film");
        System.out.println("2.lihat film yang sedang tayang");
        System.out.println("3. buat pemesanan tiket");
        System.out.println("4. cari film");
        System.out.println("5. liat transaksi");
    }

    public void tambahFilm(Admin admin){
        System.out.println("Masukkan judul : ");
        String judul = scan.nextLine();
        System.out.println("Masukkan genre : ");
        String genre = scan.nextLine();
        Modell.modelFilm.addFilm(judul,genre);
    }

    public void lihatFilm(Admin admin){
        System.out.println("Film saat ini : ");
        Modell.modelFilm.viewAllFilm();
    }

    public void PesenTiket(Admin admin){
        System.out.println("Masukkan Nama pengunjung : ");
        String nmPengunjung = scan.nextLine();
        System.out.println("Masukkan noTelp pengunjung : ");
        String notel = scan.nextLine();
        System.out.println("Nama Film : ");
        String Film = scan.nextLine();
        System.out.println("Jam tayang : ");
        String jamTayang = scan.nextLine();
        System.out.println("Studio : ");
        int namaStudio = scan.nextInt();
        scan.nextLine();
        Modell.modelPesan.addPesan(nmPengunjung,notel,Film,jamTayang,namaStudio);
    }

    public void CariFilm(Admin admin){
        System.out.println("Masukkan nama film : ");
        String nm = scan.nextLine();
        Modell.modelFilm.Searchfilm(nm);
    }

    public void viewAllPesan(Admin admin){
        System.out.println("List pemesanan : ");
        Modell.modelPesan.viewallPesanan();
    }


}
