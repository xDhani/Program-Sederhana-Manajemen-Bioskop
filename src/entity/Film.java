package entity;

public class Film {
    public String title;
    public String genre;

    public Film(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    public void viewFilm(){
        System.out.println("Nama film: "+title);
        System.out.println("Genre film : "+genre);
    }
}