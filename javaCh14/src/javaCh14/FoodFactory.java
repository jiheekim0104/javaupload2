package javaCh14;

public class FoodFactory {

	public static void main(String[] args) {
		Kimchi kimchi = new Kimchi();
		Thread thread1 = new Thread(kimchi);
		thread1.start();
		
		Chicken chicken = new Chicken();
		chicken.start();
		
		Pizza pizza = new Pizza();
		Thread thread3 = new Thread(pizza);
		thread3.start();
		
		Fruit fruit = new Fruit();
		fruit.start();
		
		
		

	}

}
