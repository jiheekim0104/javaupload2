package javaCh14;

public class Task implements Runnable {
	@Override
	public void run() {
		// ����ó���� �޼ҵ带 ���⿡ ���ش�!
		for(int i=0;i<100;i++) {
			System.out.println("û���� �������.");
		}
		
	}
}
