package javaCh16.Ex02;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(()->{
			System.out.println("출근해용");
			System.out.println("프로그래밍해용");
		});
		
		person.action(()->System.out.println("퇴근해용"));

	}

}
