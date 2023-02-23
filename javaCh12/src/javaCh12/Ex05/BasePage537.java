package javaCh12.Ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class BasePage537 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		System.out.println("대출일: " + now.format(dtfDate));

		LocalDateTime returnDate = now.plusWeeks(2);
		System.out.println("반납일: " + returnDate.format(dtfDate));

		LocalDateTime incomeDate = now.plusDays(20);
		System.out.println("월급일: " + incomeDate.format(dtfDate));

		DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		int hour = 5;
		int minute = 10;
		LocalDateTime eventTime = now.plusMinutes(60 * hour + minute);
		System.out.println("알람: " + eventTime.format(dtfTime));

		LocalDateTime future = now.plusYears(12);
		System.out.println(future.format(dtfDate));

		DateTimeFormatter dtfAll = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.of(2023, 2, 23, 9, 37);
		System.out.println("시작일: " + startDate.format(dtfAll));

		LocalDateTime endDate = LocalDateTime.of(2024, 1, 4, 12, 00);
		System.out.println("종료일: " + endDate.format(dtfAll));

		LocalDateTime saleStartDate = LocalDateTime.of(2023, 3, 1, 0, 0, 1);
		System.out.println("세일 시작일: " + saleStartDate.format(dtfAll));

		LocalDateTime saleEndDate = LocalDateTime.of(2023, 4, 30, 23, 59, 59);
		System.out.println("세일 종료일: " + saleEndDate.format(dtfAll));

		Scanner scanner = new Scanner(System.in);
		String answer = null;

		do {
			System.out.print("찾으시려는 년-월-일을 입력하세요.");
			String targetDate = scanner.nextLine();
			String[] dateArr = targetDate.split("-");

			int year = Integer.parseInt(dateArr[0]);
			int month = Integer.parseInt(dateArr[1]);
			int day = Integer.parseInt(dateArr[2]);
			LocalDateTime searchDate = LocalDateTime.of(year, month, day, 12, 00);

			if (saleStartDate.isAfter((searchDate))) {
				System.out.println("세일 기간 전");
			} else if (saleStartDate.isBefore(searchDate) && saleEndDate.isAfter(searchDate)) {
				System.out.println("세일 기간");
			} else if (saleEndDate.isBefore(searchDate)) {
				System.out.println("세일이 끝났습니다.");
			}

			System.out.println("추가 검색하시겠습니까? (y/n)");
			answer = scanner.nextLine();
		} while (answer.equalsIgnoreCase("y"));

		scanner.close();

	}
}
