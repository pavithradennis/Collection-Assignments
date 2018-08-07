package MovieTheatre;
//main class to call all the methods
public class MovieMain
{

	public static void main(String[] args)
	{
		MovieDetailsList details = new MovieDetailsList(); //object creation
		//addition of movies
		details.addMovie(new MovieDetails( "DDLJ", "Shahrukh", "Kajol" , "Romance"));
		details.addMovie(new MovieDetails( "VTV", "Simbu", "Trisha" , "Drama"));
		
		//checking if a movie is present in the list based on the name
		boolean CheckByName = details.FindByName("Dangal");
		if(CheckByName)
		{
			System.out.println("Movie Found");
		}
		else
		{
			System.out.println("Movie Not Found");
		}
		
		//checking if a movie is present in the list based on the genre
		boolean CheckByGenre = details.FindByGenre("Romance");
		if(CheckByGenre)
		{
			System.out.println("Movie Found");
		}
		else
		{
			System.out.println("Movie Not Found");
		}
		
		details.removeMovie("VTV"); //remove the movie from the list on the basis of its name
		details.display(); //display all the movies available
	}

}
