package java18.p808;

import java.io.Serializable;

public class Member implements Serializable { // �̰� ��������� ����ȭ�� �ȴ�! 
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + " : " +name;
	}
	
	
}
