package javahigh03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("배");
		set.add("바나나");
		set.add("귤");
		set.add("배");
		set.add("배");
		set.add("바나나");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // 내용물이 있다면 
			String fruit = it.next(); // 다음을 꺼낸다
			System.out.println(fruit);
		}
		
		System.out.println("크기는?" +set.size());
		
		if(set.contains("참외")) {
			System.out.println("있다.");
		} else {
			System.out.println("없다.");
		}
		
		
	}

}
