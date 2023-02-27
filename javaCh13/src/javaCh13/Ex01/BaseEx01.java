package javaCh13.Ex01;

public class BaseEx01 {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.content = "æ»≥Á«œººø‰.";
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		

				
	}
	
	

}

class Box<T>{
	public T content;
}
