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
		
		Stream<Integer> parallelStream = idNumberList.parallelStream(); // ������ ó���̹Ƿ�, ��Ƽ�� ����Ǿ� ������� ��µ����� �ʴ´�.
		parallelStream.forEach(number -> System.out.println(number+":"+Thread.currentThread().getName()));
		

	}

}
