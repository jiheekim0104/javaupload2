package javahighEx05;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) { // 앞이 트리에 새로 들어갈 자료의 주소, 뒤에가 트리에 있던 자료의 주소
		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice()));
		System.out.println("----------");
		return o1.getPrice().compareTo(o2.getPrice());
	}
	

}
