package javaCh12.q5;

import java.util.HashSet;

public class StudentMain {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		
		System.out.println("����� Student ��:" + hashSet.size()); 
	}

}
