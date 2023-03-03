package javaCh16.q8;

public class Example {
	private static Student[] students = {
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	};
	
	//avg �޼ҵ� �ۼ�
	private static double avg(Function<Student> function) { //�̺κ� �ٽ� �����غ���!
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		return (double)sum / students.length;

	}


	
	public static void main(String[] args) {
		// double englishAvg = avg(s->s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("���� ��� ����:" + englishAvg);
		
		//double mathAvg = avg(s->s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println("���� ��� ����:"+ mathAvg);

	}

	

}
