package MovieTheatre;
//class to define the methods of the movie class
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovieDetailsList 
{
 Set<MovieDetails> movie = new LinkedHashSet<>(); //set to store all the details of a movie
 
 public void addMovie(MovieDetails movieName) //method to add a movie
 {
	 movie.add(movieName);
	 System.out.println(movieName.getMov_name() + " "+ "added");
	 
 }
 
 public void removeMovie(String movieName) //method to remove a movie
 {
	 Predicate<MovieDetails> delMovie = MovieDetails -> MovieDetails.getMov_name().equals(movieName);
	 movie.remove(delMovie);
 }
 
 public void removeAll() //method to remove all the movies
 {
	 movie.clear();
	 System.out.println("All movies are deleted");
 }
 
 public boolean FindByName(String movieName) //find a movie with the name entered
 {
	 Predicate<MovieDetails> checkMovieByName = MovieDetails -> MovieDetails.getMov_name().equals(movieName);
	 return movie.stream().anyMatch(checkMovieByName);
 }
 
 public boolean FindByGenre(String genre) //find a movie based on the genre entered
 {
	 Predicate<MovieDetails> checkMovieByGenre = MovieDetails -> MovieDetails.getGenre().equals(genre);
	 return movie.stream().anyMatch(checkMovieByGenre);
 }
 
 public void display() //print the details of the movies that are playing
 {
	 Consumer<MovieDetails> disp = MovieDetails -> System.out.println(MovieDetails);
	 movie.stream().forEach(disp);
 }
 
}
