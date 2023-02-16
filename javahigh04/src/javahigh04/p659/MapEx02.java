package javahigh04.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		Map<String,Data> shopMap = new HashMap<String,Data>();
		//key: 전화번호 , value : 포인터
		Shop shop1 = new Shop("1111",new Data(100, "미사1동"));
		Shop shop2 = new Shop("1112",new Data(100, "미사2동"));
		Shop shop3 = new Shop("1113",new Data(100, "미사3동"));
		Shop shop4 = new Shop("1114",new Data(100, "미사4동"));
		Shop shop5 = new Shop("1115",new Data(100, "미사5동"));
		
		
		shopMap.put(shop1.getPhone(),shop1.getData());
		shopMap.put(shop2.getPhone(),shop2.getData());
		shopMap.put(shop3.getPhone(),shop3.getData());
		shopMap.put(shop4.getPhone(),shop4.getData());
		shopMap.put(shop5.getPhone(),shop5.getData());
		
		Data shop1Addr = shopMap.get(shop1.getPhone());
		System.out.println("고객 핸드폰 번호: " + shop1.getPhone());
		System.out.println("고객의 포인트: " + shop1Addr.getPoint());
		System.out.println("고객의 주소는: " + shop1Addr.getAddress());
		
		

	}

}
