package javaCh12.q15;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Dday {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime targetDay = LocalDateTime.of(2023, 12, 31, 0, 0);
		long remainDay = today.until(targetDay, ChronoUnit.DAYS);
		System.out.println(remainDay+"��");
		
		Date now = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy�� MM�� yy�� E���� HH�� mm��");
		System.out.println(date.format(now));

	}

}
