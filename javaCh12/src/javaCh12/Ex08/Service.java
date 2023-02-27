package javaCh12.Ex08;

public class Service {
	
	@PrintAnnotation
	public void method1() { //아무것도 없으니 기본값으로 나옴
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#",number = 20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
	@PrintAnnotation(number = 50)
	public void method5() {
		System.out.println("실행 내용5");
	}
	
	public void method4() { //이건 아무것도 안나옴 ㅇㅇ 위에 어노테이션 없잖아?
		System.out.println("실행 내용4");
	}
	
	
}
