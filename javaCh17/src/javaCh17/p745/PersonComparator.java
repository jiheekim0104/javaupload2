package javaCh17.p745;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


	@Override
	public int compare(Person o1,Person o2) {
		return Double.compare(o1.getPay(), o2.getPay());
	
	}

	
}
