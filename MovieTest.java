class Movie {
    String title, genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie: "  + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie mov = new Movie();
        mov.title = "Interstellar";
        mov.genre = "Sci-Fi";
        mov.rating = 10;
        mov.playIt();
    }
}