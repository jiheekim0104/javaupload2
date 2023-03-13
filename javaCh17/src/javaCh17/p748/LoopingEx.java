package javaCh17.p748;

import java.util.Arrays;
import java.util.stream.Stream;

import javaCh17.p745.Student;

public class LoopingEx {

	public static void main(String[] args) {
		int[] Arr = {1,2,3,4,5};
		Arrays.stream(Arr).filter(a->a%2==0).peek(n->System.out.println(n)).sum();

		
		int[] Arr2 = {2,4,6};
		System.out.println(Arrays.stream(Arr2).allMatch(a->a%2==0));
		
		System.out.println("--------------");
		Student[] studentArr = {new Student("ȫ�浿",100),new Student("ȫ�浿",80),new Student("ȫ�浿",60),new Student("ȫ�浿",70),new Student("ȫ�浿",60),new Student("ȫ�浿",50),new Student("ȫ�浿",40)};
		
		System.out.println(Arrays.stream(studentArr).allMatch(a-> a.getScore()>=60));
		System.out.println(Arrays.stream(studentArr).anyMatch(a-> a.getScore()>80));
		System.out.println(Arrays.stream(studentArr).noneMatch(a-> a.getScore()>=100));
		
		System.out.println("--------------");
		System.out.println(Arrays.stream(studentArr).count());
		System.out.println(Arrays.stream(studentArr).mapToInt(n->n.getScore()).sum());
		
		//�����̿��ϰ� ��Ʈ��Ʈ���̳� ����Ʈ������ �ٲ㼭 �غ���
		System.out.println(Arrays.stream(studentArr).mapToInt(n->n.getScore()).filter(n -> n%2==0).average().getAsDouble());
		
		Stream<Student> stream = Arrays.stream(studentArr).filter(n -> n.getScore()%2==0);
		stream.forEach(n -> System.out.println(n));
		
	}

}
