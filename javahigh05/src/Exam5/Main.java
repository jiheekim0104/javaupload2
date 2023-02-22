package Exam5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// 100 이하의 양의 정수만 입력된다. while문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		Number number = new Number();
		int sum = 0;
		String answer = null;
		
		try {
			
			do {
				System.out.print("숫자를 입력하세요: ");
				int inputNumber = Integer.parseInt(scanner.nextLine());
				number.getNumber(inputNumber);
				sum+=inputNumber;
				System.out.println("계속하시겠습니까? (y/n) ");
				answer = scanner.nextLine();
				if(answer.equals("n")) break;
			}  while (answer.equals("y")); 
			
		} catch (OverRangeNumber e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("총합: "+sum);
		
		scanner.close();
	}

}
