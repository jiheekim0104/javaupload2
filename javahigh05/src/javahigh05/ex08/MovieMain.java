package javahigh05.ex08;

import java.util.TreeSet;

public class MovieMain {

	public static void main(String[] args) {
		TreeSet<Movie> movieTreeSet = new TreeSet<Movie>(new MovieComparator());
		
		movieTreeSet.add(new Movie("��Ŀ", 12405));
		movieTreeSet.add(new Movie("�˶��", 25100));
		movieTreeSet.add(new Movie("�����Ǻ����", 11478));
		movieTreeSet.add(new Movie("��������", 30100));
		movieTreeSet.add(new Movie("�����", 33542));
		
	}

}
