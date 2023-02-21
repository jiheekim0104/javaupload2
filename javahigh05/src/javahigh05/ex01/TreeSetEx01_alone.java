package javahigh05.ex01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx01_alone {

	public static void main(String[] args) {
		TreeSet<Integer> basicPay = new TreeSet<Integer>();
		
		basicPay.add(3500000);
		basicPay.add(2150000);
		basicPay.add(2200000);
		basicPay.add(2700000);
		basicPay.add(2750000);
		
		System.out.println("���� ���� �⺻�޿�:" + basicPay.last());
		System.out.println("���� ���� �⺻�޿�:" + basicPay.first());
		System.out.println(basicPay);
		System.out.println(basicPay.descendingSet());
		
		NavigableSet<Integer> basicPaySubset = basicPay.subSet(2500000, true, 3500000, true);
		System.out.println(basicPaySubset);

		TreeSet<String> position = new TreeSet<String>();
		position.add("����");
		position.add("���");
		position.add("���");
		position.add("�븮");
		position.add("�븮");
		position.add("���");
		position.add("����");
		position.add("����");
		
		System.out.println(position);
		System.out.println(position.descendingSet());
		System.out.println(position.size());
		System.out.println("���� �ٷ� �Ʒ�:" + position.lower("����"));
		System.out.println("�븮 �ٷ� ��: "+position.higher("�븮"));
		
		
	}

}
