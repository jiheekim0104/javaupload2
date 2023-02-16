package javahighEx04;

public class Person implements Comparable<Person> {

	// imple ���ϸ� , ��� ���������ؼ� ������ ���� ���ܹ߻���
	private String name;
	private int age; // �ڷ������� �����ϸ� compareTo����
	private Double score; // Ŭ���� ���·� �����ؾ� compareTo�������� ����!
	
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
		
//		return name.compareTo(o.name); //compareTo�� int�� �������� 
//		return o.name.compareTo(name); // �Ųٷ� ���� ������! 
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