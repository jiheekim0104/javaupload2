package javahigh02.p643;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesMain {

	public static void main(String[] args) {
		List<Sales> lists = new ArrayList<Sales>();
		lists.add(new Sales("4��3��", "BC103", "������", 230, 276000, "3470-1234"));
		lists.add(new Sales("4��5��", "BL203", "���ʱ�", 150, 180000, "3470-2200"));
		lists.add(new Sales("4��8��", "AC205", "���ı�", 270, 324000, "3470-3300"));
		lists.add(new Sales("4��12��", "DU103", "��걸", 350, 420000, "3709-4321"));

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

		System.out.print("�ŷ�ó �ڵ��? ");
		String input = scanner.nextLine();
		boolean isAble = false;
		do {
			for (int i = 0; i < lists.size(); i++) {
				if (lists.get(i).getCode().equals(input)) {
					System.out.println("���������� " + lists.get(i).getArea());
					System.out.println("����ó�� " + lists.get(i).getPhone());
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
		
		System.out.println("�ְ��Ǹ� �ڵ�:" + lists.get(bestIndex).getCode());
		System.out.println("�����Ǹ� ���:"+ lists.get(worstIndex).getDate()+"|" +lists.get(worstIndex).getCode() +"|" + lists.get(worstIndex).getSaleCnt());
		
		
		

	}

}
