package javaCh17.p723;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> idNumberList = new ArrayList<Integer>();
		idNumberList.add(2012113900);
		idNumberList.add(2023030900);
		idNumberList.add(2012113900);
		idNumberList.add(2009111222);
		
		Stream<Integer> stream = idNumberList.stream();
		stream.forEach(number -> System.out.println(number));
		
		System.out.println("---------------");
		
		Stream<Integer> parallelStream = idNumberList.parallelStream(); // 스레드 처리이므로, 멀티로 진행되어 순서대로 출력되지는 않는다.
		parallelStream.forEach(number -> System.out.println(number+":"+Thread.currentThread().getName()));
		

	}

}
