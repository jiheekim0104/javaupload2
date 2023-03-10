package javaCh17.p739;

import java.util.ArrayList;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 85, 2.5));
		list.add(new Student("ȫ�浿", 92, 1.5));
		list.add(new Student("ȫ�浿", 87, 0.5));

		list.stream().mapToInt(name -> name.getScore()).forEach(score -> System.out.println(score));
		list.stream().mapToDouble(name -> name.getSight()).forEach(sight -> System.out.println(sight));
		list.stream().map(name -> name.getName()).forEach(name -> System.out.println(name));
	}

}
