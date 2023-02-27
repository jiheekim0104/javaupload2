package javaCh12.q17;

import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		//String id = "5Angle1004"; //ù��°�� ���ĺ�, �ι�°���� ��+�� (8-12)
		String id = "A1234567"; //ù��°�� ���ĺ�, �ι�°���� ��+�� (8-12)
		String regExp = "[a-z,A-z]+[a-z,A-z,0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID�� ����Ҽ��ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����Ҽ������ϴ�.");
		}

	}

}
