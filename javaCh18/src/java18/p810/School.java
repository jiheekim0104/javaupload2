package java18.p810;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) throws Exception {
		// Studnet ��ü�� �ڷ� �־ ����û�� ������. 
		// ��� ��Ʈ�� 
		
		FileOutputStream fos = new FileOutputStream("C:/webStudyB/temp/��������б������.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("������", 100,false));
		list.add(new Student("������", 90,true));
		list.add(new Student("�����", 80,true));
		list.add(new Student("������", 70,false));
		list.add(new Student("������", 60,true));
		
		
		oos.writeObject(list);
		oos.close();
		
	}
}
