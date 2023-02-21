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
		
		System.out.println("가장 높은 기본급여:" + basicPay.last());
		System.out.println("가장 낮은 기본급여:" + basicPay.first());
		System.out.println(basicPay);
		System.out.println(basicPay.descendingSet());
		
		NavigableSet<Integer> basicPaySubset = basicPay.subSet(2500000, true, 3500000, true);
		System.out.println(basicPaySubset);

		TreeSet<String> position = new TreeSet<String>();
		position.add("과장");
		position.add("사원");
		position.add("사원");
		position.add("대리");
		position.add("대리");
		position.add("사원");
		position.add("과장");
		position.add("부장");
		
		System.out.println(position);
		System.out.println(position.descendingSet());
		System.out.println(position.size());
		System.out.println("부장 바로 아래:" + position.lower("부장"));
		System.out.println("대리 바로 위: "+position.higher("대리"));
		
		
	}

}
