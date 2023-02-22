package javaCh12.Ex04;

import java.util.Random;

public class BasePage528 {
	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);
		int v11 =Math.max(3,7);
		System.out.println( v11 );
		System.out.println(Math.random());
		
		System.out.println(Math.round(25.76));
		
		//난수 얻기 
		Random random = new Random();
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		
		System.out.println("--------------------");
		
		Random random2 = new Random(10);
		System.out.println(random.nextInt());
		
	}
	
}
