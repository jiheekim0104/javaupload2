package javaCh14;

public class Task2 extends Thread { // �����尡 ���ʺ��� �ڽ��̴ϱ�
	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.println("Ƽ���� �������.");
		}
	}
}
