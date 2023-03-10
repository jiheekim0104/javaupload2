package javahigh05.ex04;

public class Person implements Comparable<Person> {

	// imple 안하면 , 어떤걸 기준으로해서 넣을지 몰라서 예외발생함
	private String name;
	private int age; // 자료형으로 선언하면 compareTo못씀
	private Double score; // 클래스 형태로 선언해야 compareTo쓸수있음 ㅇㅇ!
	
	@Override
	public int compareTo(Person o) {
//		if (age < o.age) {
//			return -1;
//		} else if (age == o.age) {
//			return 0;
//		}else return 1;
		
//		if (age < o.age) {
//		return 1;
//	} else if (age == o.age) {
//		return 0;
//	}else return -1;
		
//		return name.compareTo(o.name); //compareTo가 int를 리턴해줌 
//		return o.name.compareTo(name); // 거꾸로 찍힘 ㅇㅅㅇ! 
		return score.compareTo(o.score);
	}

	public Person(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
