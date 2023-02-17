package javahighEx05;

import java.util.TreeSet;

public class MovieMain {

	public static void main(String[] args) {
		TreeSet<Movie> movieTreeSet = new TreeSet<Movie>(new MovieComparator());
		
		movieTreeSet.add(new Movie("조커", 12405));
		movieTreeSet.add(new Movie("알라딘", 25100));
		movieTreeSet.add(new Movie("남산의부장들", 11478));
		movieTreeSet.add(new Movie("극한직업", 30100));
		movieTreeSet.add(new Movie("기생충", 33542));
		
	}

}
