package javaCh14;

public class Task implements Runnable {
	@Override
	public void run() {
		// 동시처리할 메소드를 여기에 써준다!
		for(int i=0;i<100;i++) {
			System.out.println("청바지 만들어줘.");
		}
		
	}
}
