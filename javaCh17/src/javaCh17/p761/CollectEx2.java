package javaCh17.p761;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("ȫ�浿", true, 92));
		list.add(new Student("�����", false, 87));
		list.add(new Student("���ڹ�", true, 90));
		list.add(new Student("������", false, 93));

		// �� ������Ʈ�� �Ǵ°�..!
		Map<Boolean, Double> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.getGender(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map);

		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("1�г�", "ȫ�浿", true, 92));
		list2.add(new Student("2�г�", "�����", false, 87));
		list2.add(new Student("3�г�", "���ڹ�", true, 90));
		list2.add(new Student("1�г�", "������", false, 93));
		list2.add(new Student("3�г�", "������", true, 70));
		list2.add(new Student("3�г�", "������", false, 50));

//		Map<String, Double> map1 = list2.stream()
//				.collect(
//						Collectors.groupingBy(
//						s -> s.getGre, 
//						Collectors.averagingDouble(s -> s.getScore())
//					)
//				);
//		System.out.println(map);

		List<Student> totalList1 = new ArrayList();
		totalList1.add(new Student("1�г�", "ȫ�浿", true, 92));
		totalList1.add(new Student("2�г�", "�����", true, 87));
		totalList1.add(new Student("1�г�", "���ڹ�", true, 95));
		totalList1.add(new Student("3�г�", "������", true, 93));
		totalList1.add(new Student("3�г�", "������", true, 93));
		totalList1.add(new Student("3�г�", "������", true, 93));

		Map<String, Integer> map2 = totalList1.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));

		System.out.println(map2);

		Map<String, Long> map3 = totalList1.stream()
				.collect(Collectors.groupingBy(s -> s.getGrade(), Collectors.counting()));

		System.out.println(map3);

	}

}
