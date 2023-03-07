package java18.p810;

import java.io.Serializable;

public class Student implements Serializable { // 이걸 해줘야지만 직렬화가 된다! 
	private String name;
	private int score;
	private boolean gender;
	
	private static final long serialVersionUID= -621812868470078544L; // 안쓰면 자동으로 생성된다. 이걸직접쓰면 이번호를 쓰겠다는 뜻이됩니다! 
	
	public Student(String name, int score,boolean gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return name + " : " +score+"("+gender+")";
	}
	
	
}
