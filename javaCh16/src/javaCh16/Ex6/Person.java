package javaCh16.Ex6;

public class Person {
	public Member getMember1 (Creatable1 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}
	
	public Member getMember2 (Creatable2 creatable) {
		String id = "winter";
		String name = "�Ѱܿ�";
		Member member = creatable.create(id, name);
		return member;
	}
}
