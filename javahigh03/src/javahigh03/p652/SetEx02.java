package javahigh03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("���");
		set.add("��");
		set.add("�ٳ���");
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("�ٳ���");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // ���빰�� �ִٸ� 
			String fruit = it.next(); // ������ ������
			System.out.println(fruit);
		}
		
		System.out.println("ũ���?" +set.size());
		
		if(set.contains("����")) {
			System.out.println("�ִ�.");
		} else {
			System.out.println("����.");
		}
		
		
	}

}
