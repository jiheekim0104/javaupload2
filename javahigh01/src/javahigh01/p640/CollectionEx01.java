package javahigh01.p640;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		List list = new ArrayList();
		
		int[] n1 = new int[3];
		int[] n2 = new int[5]; // 하나씩 옮겨줘야한다. 추가나, 중간에 빈경우 빈상태로 유지된다. 
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add(10); //object 타입이라 숫자도 가능가능
		
		list.get(1);
		System.out.println(list.get(1));
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list.contains("k"));
		System.out.println(list);
		
	}
}
