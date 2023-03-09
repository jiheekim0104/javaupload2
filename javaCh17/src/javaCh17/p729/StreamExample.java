package javaCh17.p729;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		double[] doubleArr = {1.1,2.2,3.3,4.4,5.5};
		Boolean[] booleanArr = {true,false,true,true,false,true};
		long[] longArr = {1000L,2000L,-123400L};
		Float[] floatArr = {2.3f, 3.5f, 5.5f};
		
		System.out.println("1");
		Arrays.stream(doubleArr).forEach(number -> System.out.println(number));
		
		System.out.println("2");
		Arrays.stream(booleanArr).forEach(result -> System.out.println(result));
		
		System.out.println("3");
		long avg = (long) Arrays.stream(longArr).average().getAsDouble();
		System.out.println(avg);

		System.out.println("4");
		float sum = (float) Arrays.stream(floatArr).mapToDouble(number->number).sum();
		System.out.println(sum);
		
		
	}

}
