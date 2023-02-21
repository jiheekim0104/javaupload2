package javahigh05.ex08;

public class Movie {
	private String movieName;
	private Integer ticketing;
	
	public Movie(String movieName, Integer ticketing) {
		super();
		this.movieName = movieName;
		this.ticketing = ticketing;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getTicketing() {
		return ticketing;
	}

	public void setTicketing(Integer ticketing) {
		this.ticketing = ticketing;
	}
	
	
	
}
