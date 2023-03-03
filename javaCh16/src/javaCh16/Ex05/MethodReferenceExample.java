package javaCh16.Ex05;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String::compareToIgnoreCase);

	}

}
