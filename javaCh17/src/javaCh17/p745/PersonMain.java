package javaCh17.p745;

import java.util.Arrays;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("A", true, 1000.90),
										new Person("B",  true, 2000.90),
										new Person("C", false, 3000.90),
										new Person("D", true, 4000.90),
										new Person("E", false, 5000.90));
										
		list.stream().sorted(new PersonComparator()).forEach(s->System.out.println(s));
		
		list.stream().filter(s->s.isGender()).sorted(new PersonComparator()).forEach(s->System.out.println(s));

		double sum = list.stream().filter(s-> !s.isGender()).mapToDouble(s -> s.getPay()).sum();
		System.out.println(sum);
	}

}
