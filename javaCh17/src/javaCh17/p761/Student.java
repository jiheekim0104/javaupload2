package javaCh17.p761;

public class Student {
	private String name;
	private boolean gender;
	private int score;
	private String grade;
	
	public Student(String name,  boolean gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	public Student(String grade, String name, boolean gender, int score) {
		super();
		this.grade = grade;
		this.name = name;
		this.gender = gender;
		this.score = score;
		
	}
	public String getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	public boolean  getGender() {
		return gender;
	}
	public int getScore() {
		return score;
	}
	
	
	@Override
	public int hashCode() {
		return score;
	}
	@Override
	public boolean equals(Object obj) {
//		if(this==obj) return true;
//		if(obj==null) return false;
//		Student other = (Student) obj;
//		if(score != other.score)
//			return false;
		return score == ((Student) obj).score;
	}
	
	
	
}
