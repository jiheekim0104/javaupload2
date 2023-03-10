package javaCh17.p736;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");

		list.stream().distinct().forEach(name -> System.out.println(name));
		System.out.println();

		list.stream().filter(name -> name.startsWith("��")).forEach(name -> System.out.println(name));
		System.out.println();

		list.stream().distinct().filter(name -> name.startsWith("��")).forEach(name -> System.out.println(name));
		System.out.println();
		
		IntStream.rangeClosed(1, 100).filter(number -> number%2==0).forEach(number -> System.out.println(number));
		System.out.println();
	}

}
