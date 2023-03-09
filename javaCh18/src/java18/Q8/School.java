package java18.Q8;

public class School {
	private String schoolName;
	private int grade;
	
	public School(String schoolName, int grade) {
		super();
		this.schoolName = schoolName;
		this.grade = grade;
	}



	@Override
	public String toString() {
		return grade+" grade in "+ schoolName +" School";
	}
	
	
	
	
	
	
}
