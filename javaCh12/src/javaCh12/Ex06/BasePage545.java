package javaCh12.Ex06;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class BasePage545 {
	public static void main(String[] args) {
	      String regExp1 = "\\d{6}\\-[1-4]\\d{6}"; // 띄어쓰기도 인식하니까 형식 맞춰서 써야함! 
	      
	      
	      if( Pattern.matches(regExp1, "812345-1345678")){
	         System.out.println("주민등록 번호가 맞습니다.");
	      } else {
	         System.out.println("주민등록 번호가 틀립니다.");
	      }
	      
	      String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	      if( Pattern.matches(regExp2, "bearitlove@naver.com")){
	         System.out.println("이메일이 맞습니다.");
	      } else {
	         System.out.println("이메일이 아닙니다.");
	      }
	      
	       System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
	         System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
	   }
}
