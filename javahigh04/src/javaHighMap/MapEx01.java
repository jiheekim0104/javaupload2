package javaHighMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>(); //<키,벨류>
		map.put("컴퓨터", 200);
		map.put("프린터", 50);
		map.put("아이폰", 210);
		map.put("갤럭시탭", 170);
		System.out.println(map.get("컴퓨터")); // 키를 넣으면 벨류가 나오는 방식!
		if(map.containsKey("냉장고")) {
			System.out.println("있다.");
		} else {
			System.out.println("없다.");
		}
		System.out.println("-----------");
		Set<String> keys = map.keySet(); // 키들만 set으로 만들어줌
		for (String key :keys) {
			if(map.get(key)>150) {
				System.out.println(key);
			}
		}
		System.out.println("-----------");
		
		
		if(map.containsValue(170)) {
			System.out.println("있다.");
		} else {
			System.out.println("없다.");
		}
		

	}

}
