package javaHighMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>(); //<Ű,����>
		map.put("��ǻ��", 200);
		map.put("������", 50);
		map.put("������", 210);
		map.put("��������", 170);
		System.out.println(map.get("��ǻ��")); // Ű�� ������ ������ ������ ���!
		if(map.containsKey("�����")) {
			System.out.println("�ִ�.");
		} else {
			System.out.println("����.");
		}
		System.out.println("-----------");
		Set<String> keys = map.keySet(); // Ű�鸸 set���� �������
		for (String key :keys) {
			if(map.get(key)>150) {
				System.out.println(key);
			}
		}
		System.out.println("-----------");
		
		
		if(map.containsValue(170)) {
			System.out.println("�ִ�.");
		} else {
			System.out.println("����.");
		}
		

	}

}