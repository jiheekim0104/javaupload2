package javaCh17.p761;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", true, 92));
		list.add(new Student("김수영", false, 87));
		list.add(new Student("김자바", true, 90));
		list.add(new Student("오혜영", false, 93));

		// 왜 오브젝트만 되는가..!
		Map<Boolean, Double> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.getGender(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map);

		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("1학년", "홍길동", true, 92));
		list2.add(new Student("2학년", "김수영", false, 87));
		list2.add(new Student("3학년", "김자바", true, 90));
		list2.add(new Student("1학년", "오혜영", false, 93));
		list2.add(new Student("3학년", "김지수", true, 70));
		list2.add(new Student("3학년", "정똘이", false, 50));

//		Map<String, Double> map1 = list2.stream()
//				.collect(
//						Collectors.groupingBy(
//						s -> s.getGre, 
//						Collectors.averagingDouble(s -> s.getScore())
//					)
//				);
//		System.out.println(map);

		List<Student> totalList1 = new ArrayList();
		totalList1.add(new Student("1학년", "홍길동", true, 92));
		totalList1.add(new Student("2학년", "김수영", true, 87));
		totalList1.add(new Student("1학년", "김자바", true, 95));
		totalList1.add(new Student("3학년", "오혜영", true, 93));
		totalList1.add(new Student("3학년", "김혜영", true, 93));
		totalList1.add(new Student("3학년", "박혜영", true, 93));

		Map<String, Integer> map2 = totalList1.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));

		System.out.println(map2);

		Map<String, Long> map3 = totalList1.stream()
				.collect(Collectors.groupingBy(s -> s.getGrade(), Collectors.counting()));

		System.out.println(map3);

	}

}
