package javahigh05.ex01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx_alone {

	public static void main(String[] args) {
		//�μ� Ű/ ��� ����
		TreeMap<String, String > company = new TreeMap<String, String>();
		
		company.put("����ȣ", "������");
		company.put("�谭��", "ȫ����");
		company.put("�迵��", "��ȹ��");

		for(String name: company.keySet()) {
			System.out.println(name + " "+ company.get(name));
		}
		System.out.println("--------------------");
		Set<Entry<String, String >> entry = company.entrySet();
		for(Entry<String, String > entryEle : entry) {
			System.out.println(entryEle.getKey() + entryEle.getValue());
		}
		System.out.println("--------------------");
		NavigableMap<String, String> descendingMap = company.descendingMap(); // ���� Ű�µ����� ����
		Set<Entry<String, String >> descendingEntry = descendingMap.entrySet();
		for(Entry<String, String> descendingEntryEle : descendingEntry ) {
			System.out.println(descendingEntryEle.getKey()+" "+ descendingEntryEle.getValue());
		}
		
	}

}