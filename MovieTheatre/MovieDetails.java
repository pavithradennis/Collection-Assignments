package MovieTheatre;

//class to import instances of the movie
public class MovieDetails {
	private String mov_name;
	private String lead_actor;
	private String lead_acteress;
	private String genre;

	// getters and setters
	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_acteress() {
		return lead_acteress;
	}

	public void setLead_acteress(String lead_acteress) {
		this.lead_acteress = lead_acteress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// parameterized constructor
	public MovieDetails(String mov_name, String lead_actor, String lead_acteress, String genre) {
		super();
		this.mov_name = mov_name;
		this.lead_actor = lead_actor;
		this.lead_acteress = lead_acteress;
		this.genre = genre;
	}

	// toString method for displaying
	@Override
	public String toString() {
		return "MovieDetails [mov_name=" + mov_name + ", lead_actor=" + lead_actor + ", lead_acteress=" + lead_acteress
				+ ", genre=" + genre + "]";
	}

}
