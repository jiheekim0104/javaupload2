package java18.Q8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School school1 = new School("Jejuelementary", 6);
		
		System.out.print("학교명과 학년을 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		String[] inputData = inputStr.split(" ");
		School school2 = new School(inputData[0], Integer.parseInt(inputData[1]));
		
		System.out.println(school1);
		System.out.println(school2);
		
		
		scanner.close();
		
	}

}
