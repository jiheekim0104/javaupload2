package javaCh12.Ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class BasePage537 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		System.out.println("������: " + now.format(dtfDate));

		LocalDateTime returnDate = now.plusWeeks(2);
		System.out.println("�ݳ���: " + returnDate.format(dtfDate));

		LocalDateTime incomeDate = now.plusDays(20);
		System.out.println("������: " + incomeDate.format(dtfDate));

		DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		int hour = 5;
		int minute = 10;
		LocalDateTime eventTime = now.plusMinutes(60 * hour + minute);
		System.out.println("�˶�: " + eventTime.format(dtfTime));

		LocalDateTime future = now.plusYears(12);
		System.out.println(future.format(dtfDate));

		DateTimeFormatter dtfAll = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.of(2023, 2, 23, 9, 37);
		System.out.println("������: " + startDate.format(dtfAll));

		LocalDateTime endDate = LocalDateTime.of(2024, 1, 4, 12, 00);
		System.out.println("������: " + endDate.format(dtfAll));

		LocalDateTime saleStartDate = LocalDateTime.of(2023, 3, 1, 0, 0, 1);
		System.out.println("���� ������: " + saleStartDate.format(dtfAll));

		LocalDateTime saleEndDate = LocalDateTime.of(2023, 4, 30, 23, 59, 59);
		System.out.println("���� ������: " + saleEndDate.format(dtfAll));

		Scanner scanner = new Scanner(System.in);
		String answer = null;

		do {
			System.out.print("ã���÷��� ��-��-���� �Է��ϼ���.");
			String targetDate = scanner.nextLine();
			String[] dateArr = targetDate.split("-");

			int year = Integer.parseInt(dateArr[0]);
			int month = Integer.parseInt(dateArr[1]);
			int day = Integer.parseInt(dateArr[2]);
			LocalDateTime searchDate = LocalDateTime.of(year, month, day, 12, 00);

			if (saleStartDate.isAfter((searchDate))) {
				System.out.println("���� �Ⱓ ��");
			} else if (saleStartDate.isBefore(searchDate) && saleEndDate.isAfter(searchDate)) {
				System.out.println("���� �Ⱓ");
			} else if (saleEndDate.isBefore(searchDate)) {
				System.out.println("������ �������ϴ�.");
			}

			System.out.println("�߰� �˻��Ͻðڽ��ϱ�? (y/n)");
			answer = scanner.nextLine();
		} while (answer.equalsIgnoreCase("y"));

		scanner.close();

	}
}
