package javahigh01.p640;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		List list = new ArrayList();
		
		int[] n1 = new int[3];
		int[] n2 = new int[5]; // �ϳ��� �Ű�����Ѵ�. �߰���, �߰��� ���� ����·� �����ȴ�. 
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add(10); //object Ÿ���̶� ���ڵ� ���ɰ���
		
		list.get(1);
		System.out.println(list.get(1));
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list.contains("k"));
		System.out.println(list);
		
	}
}
