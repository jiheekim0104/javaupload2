package java18.p810;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class EducationOffice {
	public static void main(String[] args) throws Exception {
		// �б����� ������ ��Ʈ��ũ�� �ָ� �Է¹޾Ƽ� ������ �־����
		// �Է½�Ʈ��
		
		FileInputStream fis = new FileInputStream("C:/webStudyB/temp/��������б������.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object object = ois.readObject();
//		List<Student> students = (List<Student>) ois.readObject();
		System.out.println(object);
//		System.out.println(students);
		ois.close();
		fis.close();
	}
}
