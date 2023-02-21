package javaCh12.Ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) {

		try {
			System.out.println("출력할 내용");
			System.err.println("에러나면 빨간색으로 출력");
			int value = Integer.parseInt("100");
			while (true) {

				int readDate = System.in.read();
				System.out.println(readDate);
				if (readDate == 78 || readDate == 110) {
					System.out.println("프로세스 종료");
					System.exit(0);
				}
				System.out.println("출력할 내용");
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
