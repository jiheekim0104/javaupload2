package javahigh01.p642;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.set(5, 50); // 해당자리를 뒤에 숫자로 바꿈
		System.out.println(list);
		

		System.out.println(list);
	}

}
