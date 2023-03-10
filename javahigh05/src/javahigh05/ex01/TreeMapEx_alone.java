package javahigh05.ex01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx_alone {

	public static void main(String[] args) {
		//부서 키/ 사원 벨류
		TreeMap<String, String > company = new TreeMap<String, String>();
		
		company.put("강정호", "영업부");
		company.put("김강인", "홍보부");
		company.put("김영자", "기획부");

		for(String name: company.keySet()) {
			System.out.println(name + " "+ company.get(name));
		}
		System.out.println("--------------------");
		Set<Entry<String, String >> entry = company.entrySet();
		for(Entry<String, String > entryEle : entry) {
			System.out.println(entryEle.getKey() + entryEle.getValue());
		}
		System.out.println("--------------------");
		NavigableMap<String, String> descendingMap = company.descendingMap(); // 디센팅 키셋도있음 ㅇㅇ
		Set<Entry<String, String >> descendingEntry = descendingMap.entrySet();
		for(Entry<String, String> descendingEntryEle : descendingEntry ) {
			System.out.println(descendingEntryEle.getKey()+" "+ descendingEntryEle.getValue());
		}
		
	}

}
