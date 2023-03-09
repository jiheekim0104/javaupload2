package javaCh17.p723;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("±èÁöÈñ", 80),
				new Student("°û¼öÃ¶", 10),
				new Student("¾ç¿Á´ö", 70)
				);
		
		Stream<Student> stream = list.stream();
		IntStream intStream = stream.mapToInt(name -> name.getScore());
		OptionalDouble optionalDouble = intStream.average();
		double avg1 = optionalDouble.getAsDouble();
		System.out.println(avg1);
		
		double avg2 = list.stream()
				.mapToInt(name -> name.getScore())
				.average()
				.getAsDouble();
		System.out.println(avg2);
		
		OptionalDouble avg3 = list.stream()
				.mapToInt(name -> name.getScore())
				.average();
		
		int sum = list.stream()
				.mapToInt(name -> name.getScore())
				.sum();
		System.out.println(sum);
		
		int max = list.stream()
				.mapToInt(name -> name.getScore())
				.max()
				.getAsInt();
		System.out.println(max);
	}

}
