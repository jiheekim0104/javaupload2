package javaCh17.p761;

public class Student2 implements Comparable<Student2>{
	private String name;
	private Integer age;
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return name +" "+age;
	}
	
	@Override
	public int compareTo(Student2 o) {
		return Integer.compare(age, o.age);
	}
	
	
}

