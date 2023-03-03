package javaCh16.Ex04;

public class Person {
	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		System.out.println("°á°ú:" + result);
	}
	
	
}
