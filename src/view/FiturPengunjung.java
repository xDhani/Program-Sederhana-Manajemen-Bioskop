package view;

import entity.Pengunjung;
import entity.Pesanan;
import model.ModelPesan;
import model.Modell;

import java.util.Scanner;

public class FiturPengunjung {
    Scanner scan = new Scanner(System.in);
    ModelPesan modelPesan = new ModelPesan();

    public void regist(Pengunjung pengunjung){
        System.out.println("Masukkan nm : ");
        String nm = scan.nextLine();
        System.out.println("Masukkan telp : ");
        String telp = scan.nextLine();
        Modell.modelPengunjung.addPengunjung(nm,telp);
    }
    public void menu(){
        System.out.println("1.tambah film");
        System.out.println("2.lihat film yang sedang tayang");
        System.out.println("3. buat pemesanan tiket");
        System.out.println("4. cari film");
        System.out.println("5. liat transaksi");
    }

    public void tambahFilmp(Pengunjung pengunjung){
        System.out.println("Masukkan judul : ");
        String judul = scan.nextLine();
        System.out.println("Masukkan genre : ");
        String genre = scan.nextLine();
        Modell.modelFilm.addFilm(judul,genre);
    }

    public void lihatFilmp(Pengunjung pengunjung){
        System.out.println("Film saat ini : ");
        Modell.modelFilm.viewAllFilm();
    }

    public void PesenTiketp(Pengunjung pengunjung){
        System.out.println("Masukkan Nama pengunjung : ");
        String nmPengunjung = scan.nextLine();
        System.out.println("Masukkan No Telp pengunjung : ");
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

    public void CariFilmp(Pengunjung pengunjung){
        System.out.println("Masukkan nama film : ");
        String nm = scan.nextLine();
        Modell.modelFilm.Searchfilm(nm);
    }

    public void viewAllPesanp(Pengunjung pengunjung){
        System.out.println("List pemesanan : ");
        for (Pesanan pesanan : Modell.modelPesan.listpesan){
            if (pesanan != null){
                modelPesan.viewallPesanan();
            }
        }
        System.out.println("kosong Ya");
    }
}
