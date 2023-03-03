package javaCh16.Ex6;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//익명형 구현클래스로 만들기
		Member member1 = person.getMember1( new Creatable1() {
			
			@Override
			public Member create(String id) {
				return new Member(id);
			}
		});
		
		//람다식1
		Member member2 = person.getMember1((String id)-> {
			return new Member(id);
			});
		
		//람다식2
		Member member3 = person.getMember1((id)-> new Member(id));
		
		//생성자참조 : 결과리턴이 객체 생성밖에 없다면..! 
		Member member4 = person.getMember1(Member::new);
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		
		System.out.println();
		
		Member member5 = person.getMember2( new Creatable2() {
			
			@Override
			public Member create(String id, String name) {
				return new Member(id, name);
			}
		});
		
		Member member6 = person.getMember2((String id, String name)-> {
			return new Member(id, name);
		});
		
		Member member7 = person.getMember2((id,name)-> new Member(id,name));
		
		Member member8 = person.getMember2(Member::new);
		
		System.out.println(member5);
		System.out.println(member6);
		System.out.println(member7);
		System.out.println(member8);

	}

}
