package javaCh12.Ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) {

		try {
			System.out.println("����� ����");
			System.err.println("�������� ���������� ���");
			int value = Integer.parseInt("100");
			while (true) {

				int readDate = System.in.read();
				System.out.println(readDate);
				if (readDate == 78 || readDate == 110) {
					System.out.println("���μ��� ����");
					System.exit(0);
				}
				System.out.println("����� ����");
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
