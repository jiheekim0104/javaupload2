package javaCh16.Ex03;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action1((name,job)->{
			System.out.println(name+"�� ");
			System.out.println(job+"�� �մϴ�.");
		});
		
		person.action2((word)->{
			System.out.println(word+"��� ���մϴ�.");
		});
	
		

	}

}
