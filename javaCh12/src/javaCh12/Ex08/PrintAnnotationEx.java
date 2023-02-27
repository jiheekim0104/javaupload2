package javaCh12.Ex08;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			System.out.println(method);
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			printLine(printAnnotation);
			
		}

	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i=0;i<number;i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
