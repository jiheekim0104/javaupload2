package Exam5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// 100 ������ ���� ������ �Էµȴ�. while���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scanner = new Scanner(System.in);
		Number number = new Number();
		int sum = 0;
		String answer = null;
		
		try {
			
			do {
				System.out.print("���ڸ� �Է��ϼ���: ");
				int inputNumber = Integer.parseInt(scanner.nextLine());
				number.getNumber(inputNumber);
				sum+=inputNumber;
				System.out.println("����Ͻðڽ��ϱ�? (y/n) ");
				answer = scanner.nextLine();
				if(answer.equals("n")) break;
			}  while (answer.equals("y")); 
			
		} catch (OverRangeNumber e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("����: "+sum);
		
		scanner.close();
	}

}
