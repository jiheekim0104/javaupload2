package javaCh12.Ex06;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class BasePage545 {
	public static void main(String[] args) {
	      String regExp1 = "\\d{6}\\-[1-4]\\d{6}"; // ���⵵ �ν��ϴϱ� ���� ���缭 �����! 
	      
	      
	      if( Pattern.matches(regExp1, "812345-1345678")){
	         System.out.println("�ֹε�� ��ȣ�� �½��ϴ�.");
	      } else {
	         System.out.println("�ֹε�� ��ȣ�� Ʋ���ϴ�.");
	      }
	      
	      String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	      if( Pattern.matches(regExp2, "bearitlove@naver.com")){
	         System.out.println("�̸����� �½��ϴ�.");
	      } else {
	         System.out.println("�̸����� �ƴմϴ�.");
	      }
	      
	       System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
	         System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
	   }
}
