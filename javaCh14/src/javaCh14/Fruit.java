package javaCh14;

public class Fruit extends Thread {
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
		System.out.println("과일("+i+")");
		}
		System.err.println("과일(100)");
	}

}