package javaCh16.Ex02;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(()->{
			System.out.println("����ؿ�");
			System.out.println("���α׷����ؿ�");
		});
		
		person.action(()->System.out.println("����ؿ�"));

	}

}
