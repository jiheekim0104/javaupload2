package javaCh14;

public class Phone {

	public static void main(String[] args) {
		Runnable runnable1 =  new Runnable() {
			public void run() {
				for(int i =0;i<100;i++) {
					System.out.println("전화하기");
				}
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		Runnable runnable2 =  new Runnable() {
			public void run() {
				for(int i =0;i<100;i++) {
					System.out.println("유튜브보기");
				}
			}
		};
		
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		
		Runnable runnable3 =  new Runnable() {
			public void run() {
				for(int i =0;i<100;i++) {
					System.out.println("카톡하기");
				}
			}
		};
		
		Thread thread3= new Thread(runnable3);
		thread3.start();
		
//		for(int i=1; i<=3;i++) {
//			String threadNum = "thread"+i;
//			String runnableNum = "runnable"+i;
//			Thread threadNum= new Thread(runnableNum);
//			threadNum.start();
//		}
//		
//		int a = 10;
//		String a = "가";
		
	}

}
