package javahighEx05;

import java.util.TreeSet;

public class BusMain {

	public static void main(String[] args) {
		TreeSet<Bus> busTreeSet = new TreeSet<Bus>(new BusComparator());
		
		busTreeSet.add(new Bus("�溹��", 6));
		busTreeSet.add(new Bus("��ȭ��", 3));
		busTreeSet.add(new Bus("û��õ", 4));
		busTreeSet.add(new Bus("�λ絿", 5));
	}

}
