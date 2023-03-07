package java18.p810;

import java.io.Serializable;

public class Student implements Serializable { // �̰� ��������� ����ȭ�� �ȴ�! 
	private String name;
	private int score;
	private boolean gender;
	
	private static final long serialVersionUID= -621812868470078544L; // �Ⱦ��� �ڵ����� �����ȴ�. �̰��������� �̹�ȣ�� ���ڴٴ� ���̵˴ϴ�! 
	
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
