package javaCh16.q4;

public class Example {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("�۾������尡 ����˴ϴ�.");
				System.out.println("�۾������尡 ����˴ϴ�.");
				System.out.println("�۾������尡 ����˴ϴ�.");

			}
		});

		
		
		Thread thread2 = new Thread(() -> {
				System.out.println("�۾������尡 ����˴ϴ�.");
				System.out.println("�۾������尡 ����˴ϴ�.");
				System.out.println("�۾������尡 ����˴ϴ�.");

			});
		thread.start();

	}

}
