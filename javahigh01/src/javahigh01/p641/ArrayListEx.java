package javahigh01.p641;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // String이 아닌것을 들어가는것을 막아줌
		list.add("김지희");
		list.add("서강준");
		list.add("진양철");
		list.add(1, "윤현우"); // 1번 자리에 넣거라~ 그럼 그자리에 들어가고 오른쪽으로 한칸씩 밀어줌
		System.out.println(list); // 반복문으로 출력해도됨 
		
		System.out.println(list.contains("홍길동"));
		list.remove("서강준");
		System.out.println(list);
		
		list.remove("윤현우");
		System.out.println(list);
		
		list.removeAll(list); // clear와의 차이? -> removeAll은 같은 객체를 삭제해주는목적이라서 단순히 다 지우는 clear랑 비교했을때 느리게 반응함.컬렉션 타입의 인수를 가졌다.
		System.out.println(list);
		
		System.out.println(list.isEmpty());

	}
}
