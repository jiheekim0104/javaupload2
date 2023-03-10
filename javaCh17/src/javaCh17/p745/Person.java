package javaCh17.p745;

public class Person {
	private String name;
	private boolean gender;
	private Double pay;
	
	public Person(String name, boolean gender, double pay) {
		super();
		this.name = name;
		this.gender = gender;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public boolean isGender() {
		return gender;
	}
	public double getPay() {
		return pay;
	}
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", pay=" + pay;
	}
	
	
	
}
