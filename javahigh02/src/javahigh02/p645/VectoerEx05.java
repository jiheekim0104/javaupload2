package javahigh02.p645;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectoerEx05 {

	public static void main(String[] args) {
		List<Student> vlist = new Vector<Student>(); //������ ���α׷����� �̿�Ǵ� ArrayList�� ������ �÷���, �ٸ� ������(��Ƽó��)���� ArrayList ��� ��� 
		

		vlist.add(new Student("������", 80));
		vlist.add(new Student("������", 100));
		vlist.add(new Student("������", 90));
		vlist.add(new Student("������", 50));
		
		Iterator<Student> it = vlist.iterator(); //�ݺ���
		
		while (it.hasNext()) {
			Student st = it.next(); 
			System.out.println(st);
		}	
		
		vlist.remove(2);
		
		it = vlist.iterator();
		while (it.hasNext()) {
			Student st = it.next(); 
			System.out.println(st);
		}
		
		boolean isE = vlist.isEmpty();
		if(isE) {
			System.out.println("�ƹ��͵� ����.");
		} else {
			System.out.println("�ִ�.");
		}
	}

}
