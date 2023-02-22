package Exam5;

public class Number {
	int number;

	public Number() {
	}
	
	public void getNumber(int number) throws Exception {
		if(number<1||number>100) {
			throw new OverRangeNumber("1이상 100이하의 숫자만 입력가능합니다.");
		} 
	}
	
	
}
