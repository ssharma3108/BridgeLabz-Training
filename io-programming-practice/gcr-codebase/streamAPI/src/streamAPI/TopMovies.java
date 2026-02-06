package streamAPI;

import java.util.*;
import java.util.Arrays;

class Movie{

	String nameString;
	double rating;
	double releaseYear;
	
	
	Movie(String nameString,double rating,double releaseYear){
		this.nameString=nameString;
		this.rating=rating;
		this.releaseYear=releaseYear;
	}

	
	public String  toString() {
		return "Name -: "+nameString+" Rating -: "+rating+ " ReleaseYear -: "+ releaseYear;
	}
	
	
}



public class TopMovies {
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
	
	
	//top 5 based on rating 
	movies.stream().sorted(Comparator.comparing(x->x.rating)).limit(5).forEach(System.out::println);
	
	System.out.println("================================================================");
	
	//top 5 based on release year
	movies.stream().sorted(Comparator.comparing(x->x.releaseYear)).limit(5).forEach(System.out::println);

	
}
}
