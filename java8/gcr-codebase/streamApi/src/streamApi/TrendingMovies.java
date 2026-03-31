package streamApi;

import java.util.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    public Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Name -: " + name +
               " | Rating -: " + rating +
               " | ReleaseYear -: " + releaseYear;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Parasite", 8.5, 2019),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("Joker", 8.4, 2019),
            new Movie("Titanic", 7.9, 1997),
            new Movie("Forrest Gump", 8.8, 1994),
            new Movie("The Matrix", 8.7, 1999),
            new Movie("Gladiator", 8.5, 2000)
        );

       
        System.out.println("Top 5 Movies by Rating:");
        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
              .limit(5)
              .forEach(System.out::println);

        System.out.println("================================================");

        
        System.out.println("Top 5 Movies by Release Year:");
        movies.stream()
              .sorted(Comparator.comparingInt((Movie m) -> m.releaseYear).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
