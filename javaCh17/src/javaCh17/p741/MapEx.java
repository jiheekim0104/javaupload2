package javaCh17.p741;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MapEx {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream().forEach(d->System.out.println(d));
		
		long[] longArr = {1L,2L,3L,4L};
		LongStream longStream = Arrays.stream(longArr);
		longStream.asDoubleStream().forEach(l->System.out.println(l*3.14));
		
		double[] doubleArr = {1.1,2.2,3.3};
		DoubleStream doubleStream = Arrays.stream(doubleArr);
		Stream<Double> stream =  doubleStream.boxed();
		stream.forEach(n -> System.out.println(n));
	}
}
