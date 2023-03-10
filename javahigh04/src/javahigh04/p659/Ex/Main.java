package javahigh04.p659.Ex;

import java.util.HashMap; // Hashtable 이라는것도 있다! 이건 스레드가능 !
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String,Data> classroomMap = new HashMap<String,Data>();
		
		Classroom classroom1 = new Classroom("정현희", new Data("3학년 1반", 30));
		Classroom classroom2 = new Classroom("홍길동", new Data("2학년 2반", 27));

		classroomMap.put(classroom1.getTeachername(), classroom1.getData());
		classroomMap.put(classroom2.getTeachername(), classroom2.getData());
		
		Data classroom1Addr = classroomMap.get(classroom1.getTeachername());
		Data classroom2Addr = classroomMap.get(classroom2.getTeachername());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("선생님 이름을 입력하세요: ");
		String searchName = scanner.nextLine();
		
		if(searchName.equals(classroom1.getTeachername())){
			System.out.println(classroom1Addr.getRoomNumber() + "& "+ classroom1Addr.getStudentCnt());
		} else {
			System.out.println(classroom2Addr.getRoomNumber() + "& "+ classroom2Addr.getStudentCnt());
		}
		
		System.out.println("------------------");
		
		Set<String> keys = classroomMap.keySet();
		for(String teacherName : keys) {
			Data getData = classroomMap.get(teacherName);
			System.out.println(teacherName);
			System.out.println(getData.getRoomNumber());
			System.out.println(getData.getStudentCnt());
		}
		
		System.out.println(keys.size());
		
		
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String teacherName = iterator.next();
			Data getData = classroomMap.get(teacherName);
			System.out.println(teacherName);
			System.out.println(getData.getRoomNumber());
			System.out.println(getData.getStudentCnt());
		}
		
		scanner.close();
	}

}
