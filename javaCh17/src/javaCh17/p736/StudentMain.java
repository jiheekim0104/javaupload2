package javaCh17.p736;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("½Å±æµ¿", 10));
		list.add(new Student("±è±æµ¿2", 15));
		list.add(new Student("±è±æµ¿3", 20));
		list.add(new Student("¹Ú±æµ¿4", 25));
		list.add(new Student("½Å±æµ¿5", 30));
		
		//list.stream().filter(student-> student.getAge()<20).forEach(student->System.out.println(student));
		list.stream().distinct().filter(student -> student.getName().startsWith("±è")).filter(student -> student.getAge() ==20).forEach(student->System.out.println(student));
		
		
	}

}
