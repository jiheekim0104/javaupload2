package javaCh13.Ex01;

public class BaseEx07 {

}

class Person {

}

class Worker extends Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

class MiddleStudent extends Student {

}

class Applicant<T> {
	public T kind;

	public Applicant(T kind) {
		this.kind = kind;
	}
}

class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "�̰� �ڽ�1 �����");
	}

	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "�̰� �ڽ�2 �����");
	}

	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "�̰� �ڽ�3 �����");
	}

	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
	
	}
}
