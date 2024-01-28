package entity;
public class Penayangan {
    public Film film;
    public Studio studio;
    public String time;
    public int ticketPrice;

    public Penayangan(Film film, Studio studio, String time, int ticketPrice) {
        this.film = film;
        this.studio = studio;
        this.time = time;
        this.ticketPrice = ticketPrice;
    }

    public Film getFilm() {
        return film;
    }

    public Studio getStudio() {
        return studio;
    }

    public String getTime() {
        return time;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void viewPenayangan(){
        System.out.println("NAMA FILM : " + film.title);
        System.out.println("NAMA Studio : " + studio.getKode());
        System.out.println("Waktu tayang : " + time);
        System.out.println("Harga tiket : "+ticketPrice);
    }
}