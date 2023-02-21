package javahigh05.ex05;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		return o1.getBusStop().compareTo(o2.getBusStop());
	}
	
}
