package javaCh12.Ex06;

import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class BasePage542 {

	public static void main(String[] args) {
	      double i = 0.12345678901234567890123456; 
	      System.out.println(i);
	      
	      double j = 10.5;
	      double num = 1234567.89;
	      
	      System.out.println("-----------------");
	      // �Ҽ��� 3���� ����ϰ�ʹ�!
	      DecimalFormat df3 = new DecimalFormat("#.###"); // �ش��ϴ� �Ҽ����ڸ��� ���ڰ� ������ �׳� �������� ���
	      System.out.println(df3.format(i));
	      System.out.println(df3.format(j));
	      
	      System.out.println("-----------------");
	      DecimalFormat df1 = new DecimalFormat("0.000"); // �ش��ϴ� �Ҽ����ڸ��� ���ڰ� ������ 0���� ���
	      System.out.println(df1.format(i));
	      System.out.println(df1.format(j));
	      
	      
	      System.out.println("-----------------");
	      DecimalFormat dfMoney = new DecimalFormat("\u00A4 #.###");
	      System.out.println(dfMoney.format(num));
	      
	      System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
	        System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
	   }

}
