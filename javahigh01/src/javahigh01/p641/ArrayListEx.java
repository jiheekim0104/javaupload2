package javahigh01.p641;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // String�� �ƴѰ��� ���°��� ������
		list.add("������");
		list.add("������");
		list.add("����ö");
		list.add(1, "������"); // 1�� �ڸ��� �ְŶ�~ �׷� ���ڸ��� ���� ���������� ��ĭ�� �о���
		System.out.println(list); // �ݺ������� ����ص��� 
		
		System.out.println(list.contains("ȫ�浿"));
		list.remove("������");
		System.out.println(list);
		
		list.remove("������");
		System.out.println(list);
		
		list.removeAll(list); // clear���� ����? -> removeAll�� ���� ��ü�� �������ִ¸����̶� �ܼ��� �� ����� clear�� �������� ������ ������.�÷��� Ÿ���� �μ��� ������.
		System.out.println(list);
		
		System.out.println(list.isEmpty());

	}
}
