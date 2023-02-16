package javahigh02.p643;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesMain {

	public static void main(String[] args) {
		List<Sales> lists = new ArrayList<Sales>();
		lists.add(new Sales("4월3일", "BC103", "강남구", 230, 276000, "3470-1234"));
		lists.add(new Sales("4월5일", "BL203", "서초구", 150, 180000, "3470-2200"));
		lists.add(new Sales("4월8일", "AC205", "송파구", 270, 324000, "3470-3300"));
		lists.add(new Sales("4월12일", "DU103", "용산구", 350, 420000, "3709-4321"));

		Scanner scanner = new Scanner(System.in);
		/*
		 * String date = scanner.nextLine(); String code = scanner.nextLine(); String
		 * area= scanner.nextLine(); int saleCnt= Integer.parseInt(scanner.nextLine());
		 * int saleMoney = Integer.parseInt(scanner.nextLine()); String phone=
		 * scanner.nextLine(); lists.add(new Sales(date, code, area, saleCnt, saleMoney,
		 * phone));
		 */
		for (Sales list : lists) {
			System.out.println(list.toString());
		}

		System.out.print("거래처 코드는? ");
		String input = scanner.nextLine();
		boolean isAble = false;
		do {
			for (int i = 0; i < lists.size(); i++) {
				if (lists.get(i).getCode().equals(input)) {
					System.out.println("매출지역은 " + lists.get(i).getArea());
					System.out.println("연락처는 " + lists.get(i).getPhone());
				} 
				break;
			} 
			isAble = true;
		} while (!isAble);
		
	

		int bestMoney = Integer.MIN_VALUE;
		int bestIndex = -1;
		int worstMoney = Integer.MAX_VALUE;
		int worstIndex = -1;
		for (int i = 0; i < lists.size(); i++) {
			if (bestMoney < lists.get(i).getSaleMoney()) {
				bestMoney = lists.get(i).getSaleMoney();
				bestIndex = i;
			} 
			if(worstMoney >lists.get(i).getSaleMoney()) {
				worstMoney = lists.get(i).getSaleMoney(); 
				worstIndex = i;
			}

		}
		
		System.out.println("최고판매 코드:" + lists.get(bestIndex).getCode());
		System.out.println("최저판매 기록:"+ lists.get(worstIndex).getDate()+"|" +lists.get(worstIndex).getCode() +"|" + lists.get(worstIndex).getSaleCnt());
		
		
		

	}

}
