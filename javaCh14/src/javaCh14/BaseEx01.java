package javaCh14;

public class BaseEx01 {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread1 = new Thread(task);
		thread1.start();
		
		Task2 task2 = new Task2();
		task2.start();
		
		for(int i =0; i<100;i++) {
			System.out.println("모자를 만들어줘.");
		}
		
		
		
		
	}

}
