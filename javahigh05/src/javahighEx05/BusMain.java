package javahighEx05;

import java.util.TreeSet;

public class BusMain {

	public static void main(String[] args) {
		TreeSet<Bus> busTreeSet = new TreeSet<Bus>(new BusComparator());
		
		busTreeSet.add(new Bus("경복궁", 6));
		busTreeSet.add(new Bus("광화문", 3));
		busTreeSet.add(new Bus("청계천", 4));
		busTreeSet.add(new Bus("인사동", 5));
	}

}
