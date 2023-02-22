package javaCh12.Ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasePage519 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "�ڹ�";
		byte[] arr1 = data.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr1));
		String str1 = new String(arr1,"UTF-8");
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes();
		System.out.println(Arrays.toString(arr2));
		String str2 = new String(arr2);
		System.out.println(str2);

		String name = "������";
		byte[] arr3 = name.getBytes();
		System.out.println(Arrays.toString(arr3));
		String str3 = new String(arr3);
		System.out.println(str3);
		
		data+="�Դϴ�.";
		System.out.println(data); // �̰� �տ� �����Ͱ� �������� ���� ���ο� �����Ͱ� ������ ��� 
		
		StringBuilder data2 = new StringBuilder("abc");
		data2.append("def"); // ���� �����Ϳ��ٰ� �߰��� �Ǵ� ���
		System.out.println(data2);
		
		data2.insert(5, "le");
		System.out.println(data2); // ���� �����Ϳ��� ���ϴ� �ڸ��� �߰��Ǵ� ���
		
		String data3 = "ȫ�浿,�̼�ȫ&�ڿ��� �̼���-������";
		String[] arr4 = data3.split(",|&| |-");
		for(String a4 : arr4) {
			System.out.println(a4);
		}
		System.out.println("------------------------");
		String data4 = "ȫ�浿*�̼�ȫ@�ڿ���,�̼���-������";
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
