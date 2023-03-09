package javaCh17.p723;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("박동은");
		set.add("주연진");
		set.add("이태오");
		
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		

	}

}
