package javaCh14;

public class Kimchi implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("��ġ("+i+")");
		}
		
		System.err.println("��ġ(100)");
	}
		
}
