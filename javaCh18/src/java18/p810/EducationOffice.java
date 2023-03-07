package java18.p810;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class EducationOffice {
	public static void main(String[] args) throws Exception {
		// 학교에서 성적을 네트워크로 주면 입력받아서 가지고 있어야함
		// 입력스트림
		
		FileInputStream fis = new FileInputStream("C:/webStudyB/temp/이젠고등학교생기부.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object object = ois.readObject();
//		List<Student> students = (List<Student>) ois.readObject();
		System.out.println(object);
//		System.out.println(students);
		ois.close();
		fis.close();
	}
}
