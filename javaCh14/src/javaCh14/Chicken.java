package javaCh14;

public class Chicken extends Thread {
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("ġŲ("+i+")");
		}
		System.err.println("ġŲ(100)");
	}
}
