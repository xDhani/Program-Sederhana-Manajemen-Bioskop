package view;
import model.*;
import entity.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Film film = new Film("Bakso Tanpa Tepung","Mas Roy");
        Studio studio = new Studio(1);
        ModelPenayangan modelPenayangan = new ModelPenayangan();
        Modell.modelAdmin.addAdmin("admin","admin","213");
        modelPenayangan.addTayang(film,studio,"7 malam",1000);
        Fitur fitur = new Fitur();
        FiturPengunjung fiturPengunjung = new FiturPengunjung();
//        modelPenayangan.viewAllTayang();
        Scanner scan = new Scanner(System.in);
        Modell.modelPengunjung.addPengunjung("pengunjung","123");
//        ko:
        awal:
while (true){
    System.out.println("1.Login Admin");
    System.out.println("2.Login Pengunjung");
    System.out.println("3.EXIT");
    System.out.println("Pilih : ");
    int Pilih = scan.nextInt();
    scan.nextLine();
    switch (Pilih){
        case 1:
            boolean isAdminAuthenticated = false;
            while (!isAdminAuthenticated) {
            System.out.println("Masukkan nama : ");
            String namaAdmin = scan.nextLine();
            System.out.println("Masukkan pass : ");
            String pasAdmin = scan.nextLine();
                for (Admin admin : Modell.modelAdmin.adminArrayList) {
                    if (admin.getNama().equalsIgnoreCase(namaAdmin)) {
                        if (admin.getPass().equalsIgnoreCase(pasAdmin)) {
                            boolean login = true;
                            while (login) {
                                System.out.println("1.tambah film");
                                System.out.println("2.lihat film yang sedang tayang");
                                System.out.println("3. buat pemesanan tiket");
                                System.out.println("4. cari film");
                                System.out.println("5. liat transaksi");
                                System.out.println("Pilih : ");
                                int pilih = scan.nextInt();
                                scan.nextLine();
                                switch (pilih) {
                                    case 1:
                                        fitur.tambahFilm(admin);
                                        break;
                                    case 2:
                                        fitur.lihatFilm(admin);
                                        break;
                                    case 3:
                                        fitur.PesenTiket(admin);
                                        break;
                                    case 4:
                                        fitur.CariFilm(admin);
                                        break;
                                    case 5:
                                        fitur.viewAllPesan(admin);
                                        break;
                                    default:
                                        System.out.println("exit2");
                                        continue awal;
                                }
                            }
                        } else {
                            System.out.println("Password salah");
                        }
                    } else {
                        System.out.println("Username salah");
                    }
                }
                // If not authenticated, prompt for input again
                if (!isAdminAuthenticated) {
                    System.out.println("Masukkan nama : ");
                    namaAdmin = scan.nextLine();
                    System.out.println("Masukkan pass : ");
                    pasAdmin = scan.nextLine();
                }
            }


        case 2:
            System.out.println("Masukkan nama : ");
            String nama = scan.nextLine();
            System.out.println("Masukkan pass : ");
            String pass = scan.nextLine();
            for (Pengunjung pengunjung : Modell.modelPengunjung.pengunjunList){
                if (pengunjung.getNama().equalsIgnoreCase(nama)){
                    if (pengunjung.getTelp().equalsIgnoreCase(pass)){
                        boolean login1 = true;
                        while (login1) {
//                            System.out.println("1.tambah film");
                            System.out.println("1. lihat film yang sedang tayang");
                            System.out.println("2. buat pemesanan tiket");
                            System.out.println("3. cari film");
                            System.out.println("4. liat transaksi");
                            System.out.println("Pilih : ");
                            int pilih = scan.nextInt();
                            switch (pilih) {
                                case 1:
                                    fiturPengunjung.lihatFilmp(pengunjung);
                                    break;
                                case 2:
                                    fiturPengunjung.PesenTiketp(pengunjung);
                                    break;
                                case 3:
                                    fiturPengunjung.CariFilmp(pengunjung);
                                    break;
                                case 4:
                                    fiturPengunjung.viewAllPesanp(pengunjung);
                                    break;
                                default:
                                    System.out.println("salahh");
                                    login1 = false;
                                    break ;
                            }
                        }
                    }else {
                        System.out.println("pasword salah bege");
                    }
                }else {
                    System.out.println("username salah");
                }
            }
        case 3:
            System.out.println("anda keluar dari program");
            break;
            }
        }
    }
}
