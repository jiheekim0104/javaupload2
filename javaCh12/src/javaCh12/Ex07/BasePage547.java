package javaCh12.Ex07;

public class BasePage547 {

	public static void main(String[] args) throws Exception {
		Class c1 = Car.class;
		System.out.println(c1);
		
		
		
//		Class c3;
//		try {
//			c3 = Class.forName("javaCh12.Ex07.Car");
//			System.out.println(c3.getDeclaredConstructor());
//			System.out.println(c3.getDeclaredFields());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		Class clazz = BasePage547.class; // Car 클래스 메타정보를 얻는다. 
		String photo1Path = clazz.getResource("10.png").getPath();
		String photo2Path = clazz.getResource("image/10.png").getPath();
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
	}

}


class Car {
	private String color;
	public Car (String color) {
		this.color = color;
	}
}