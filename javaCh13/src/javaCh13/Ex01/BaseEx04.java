package javaCh13.Ex01;

public class BaseEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A<I>{
	
}

class AA<I,J> extends A<I> { //부모꺼를 그대로 받아오거나, 그 이상이거나! 
	
}

class AAA<I,J,K> extends AA<I,J>{
	
}
