package javaCh12.Ex05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage532 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:MM:ss");
		System.out.println(sdf.format(date));
	
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println(sdf.format(date));
		
		
	}
	
}
