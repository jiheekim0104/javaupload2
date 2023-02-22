package javaCh12.Ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasePage519 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		byte[] arr1 = data.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr1));
		String str1 = new String(arr1,"UTF-8");
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes();
		System.out.println(Arrays.toString(arr2));
		String str2 = new String(arr2);
		System.out.println(str2);

		String name = "김지희";
		byte[] arr3 = name.getBytes();
		System.out.println(Arrays.toString(arr3));
		String str3 = new String(arr3);
		System.out.println(str3);
		
		data+="입니다.";
		System.out.println(data); // 이건 앞에 데이터가 버려지고 더한 새로운 데이터가 나오는 방식 
		
		StringBuilder data2 = new StringBuilder("abc");
		data2.append("def"); // 기존 데이터에다가 추가가 되는 방식
		System.out.println(data2);
		
		data2.insert(5, "le");
		System.out.println(data2); // 기존 데이터에서 원하는 자리에 추가되는 방식
		
		String data3 = "홍길동,이수홍&박연수 이순신-강감찬";
		String[] arr4 = data3.split(",|&| |-");
		for(String a4 : arr4) {
			System.out.println(a4);
		}
		System.out.println("------------------------");
		String data4 = "홍길동*이수홍@박연수,이순신-강감찬";
		StringTokenizer str = new StringTokenizer(data4,"*|-|,|@");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
		
		Integer i =100;
		int iv = i.intValue();
		
		int ii = 200;
		Integer.valueOf(ii);
		
		Double d = 3.4;
		double dv = d.intValue();
		
		float f = 1.2f;
		Float.valueOf(f);
		
		
		
	}

}
