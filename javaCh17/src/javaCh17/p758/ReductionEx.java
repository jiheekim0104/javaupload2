package javaCh17.p758;

import java.util.Arrays;
import java.util.List;

import javaCh17.p745.Student;

public class ReductionEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("È«±æµ¿", 92),new Student("½Å¿ë±Ç", 95),new Student("±èÀÚ¹Ù", 88));
		
		System.out.println(list.stream().map(Student::getScore).reduce((a,b)->a+b));
		
		System.out.println(list.stream().map(Student::getScore).reduce((a,b)->a+b-10));
		
		List<Student> list2 = Arrays.asList();
		System.out.println(list2.stream().map(Student::getScore).reduce((a,b)->a+b));
	}

}
