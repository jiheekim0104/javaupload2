package javaCh12.Ex05;

import java.util.Calendar;
import java.util.TimeZone;

public class BasePage534 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // ������ - 4 
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
		switch(now.get(Calendar.DAY_OF_WEEK)){
			case 1 : 
				System.out.println("�Ͽ���");
				break;
			case 2 : 
				System.out.println("������");
				break;
			case 3 : 
				System.out.println("ȭ����");
				break;
			case 4 : 
				System.out.println("������");
				break;
			case 5 : 
				System.out.println("�����");
				break;
			case 6 : 
				System.out.println("�ݿ���");
				break;
			case 7 : 
				System.out.println("�����");
				break;
				
		}
		System.out.println("----------------------");
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now0 = Calendar.getInstance(timeZone);
		
		System.out.println(now0.get(Calendar.YEAR));
		System.out.println(now0.get(Calendar.MONTH)+1);
		System.out.println(now0.get(Calendar.DATE));
		System.out.println(now0.get(Calendar.AM_PM));
		System.out.println(now0.get(Calendar.DAY_OF_WEEK)); 
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
//		String[] avaiID = TimeZone.getAvailableIDs();
//		int index = 1;
//		for(String id : avaiID) {
//			System.out.println((index++)+"." + id);
//		}
	}
}
