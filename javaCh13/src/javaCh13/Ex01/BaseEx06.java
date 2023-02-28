package javaCh13.Ex01;

public class BaseEx06 {

	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare("+t1.getClass().getSimpleName()+ ","+t2.getClass().getSimpleName()+")");
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return v1 == v2;
	}
	
	public static void main(String[] args) {
		boolean result = BaseEx06.compare(10.0, 20.0);
		System.out.println(result);
		
//		boolean result2 = BaseEx06.compare("이순신", "이순신");
//		System.out.println(result2);
	}

}
