package javaCh12.Ex02;

public class BaseEx01 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		int sum =0;
		for(int i = 1;i<10000000;i++) {
			sum +=i;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("소요시간:"+ (endTime-startTime));
		
		long startDay = startTime/1000/60/60/24/365;
		System.out.println(startDay);
		

	}

}
