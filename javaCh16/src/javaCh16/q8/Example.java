package javaCh16.q8;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg 메소드 작성
	private static double avg(Function<Student> function) { //이부분 다시 생각해볼것!
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		return (double)sum / students.length;

	}


	
	public static void main(String[] args) {
		// double englishAvg = avg(s->s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수:" + englishAvg);
		
		//double mathAvg = avg(s->s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수:"+ mathAvg);

	}

	

}
