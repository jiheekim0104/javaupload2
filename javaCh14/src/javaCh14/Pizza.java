package javaCh14;

public class Pizza  implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("피자("+i+")");
		}
		System.err.println("피자(100)");
	}
		
}


