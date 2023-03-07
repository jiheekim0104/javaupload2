package java18.p810;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) throws Exception {
		// Studnet 객체에 자료 넣어서 교육청에 보낸다. 
		// 출력 스트림 
		
		FileOutputStream fos = new FileOutputStream("C:/webStudyB/temp/이젠고등학교생기부.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("김지희", 100,false));
		list.add(new Student("곽덕출", 90,true));
		list.add(new Student("양봉석", 80,true));
		list.add(new Student("이향춘", 70,false));
		list.add(new Student("이재훈", 60,true));
		
		
		oos.writeObject(list);
		oos.close();
		
	}
}
