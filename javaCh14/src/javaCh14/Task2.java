package javaCh14;

public class Task2 extends Thread { // 스레드가 러너블의 자식이니까
	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.println("티셔츠 만들어줘.");
		}
	}
}
