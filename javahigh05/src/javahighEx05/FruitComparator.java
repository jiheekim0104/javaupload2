package javahighEx05;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) { // ���� Ʈ���� ���� �� �ڷ��� �ּ�, �ڿ��� Ʈ���� �ִ� �ڷ��� �ּ�
		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice()));
		System.out.println("----------");
		return o1.getPrice().compareTo(o2.getPrice());
	}
	

}
