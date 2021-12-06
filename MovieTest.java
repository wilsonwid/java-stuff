class Movie {
    String name, genre;
    int rating;

    void playIt() {
        System.out.println("Now playing: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}

public class MovieTest { 
    public static void main(String args[]) { 
        Movie m1 = new Movie();
        m1.name = "Interstellar";
        m1.genre = "Sci-Fi";
        m1.rating = 9;

        m1.playIt();
    }
}