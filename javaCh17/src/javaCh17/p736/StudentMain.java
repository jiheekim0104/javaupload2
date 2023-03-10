package javaCh17.p736;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("�ű浿", 10));
		list.add(new Student("��浿2", 15));
		list.add(new Student("��浿3", 20));
		list.add(new Student("�ڱ浿4", 25));
		list.add(new Student("�ű浿5", 30));
		
		//list.stream().filter(student-> student.getAge()<20).forEach(student->System.out.println(student));
		list.stream().distinct().filter(student -> student.getName().startsWith("��")).filter(student -> student.getAge() ==20).forEach(student->System.out.println(student));
		
		
	}

}
