package javaCh17.q7;

public class Member {
	private String name;
	private String job;
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + job;
	}
	
	
	
}
