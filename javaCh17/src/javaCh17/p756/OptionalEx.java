package javaCh17.p756;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
//		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		
		OptionalDouble optional1 = list.stream().mapToInt(Integer::intValue).average();
		if(optional1.isPresent()) {
			System.out.println(optional1.getAsDouble());
		} else {
			System.out.println("0");
		}
		
		
		
	}
}
