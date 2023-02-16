package javahigh02.p645;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectoerEx05 {

	public static void main(String[] args) {
		List<Student> vlist = new Vector<Student>(); //스레드 프로그램에서 이용되는 ArrayList와 동일한 컬렉션, 다만 스레드(멀티처리)에서 ArrayList 대신 사용 
		

		vlist.add(new Student("김지희", 80));
		vlist.add(new Student("이재훈", 100));
		vlist.add(new Student("김지수", 90));
		vlist.add(new Student("스파이", 50));
		
		Iterator<Student> it = vlist.iterator(); //반복자
		
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
			System.out.println("아무것도 없다.");
		} else {
			System.out.println("있다.");
		}
	}

}
