package javaCh12.Ex08;

public class Service {
	
	@PrintAnnotation
	public void method1() { //�ƹ��͵� ������ �⺻������ ����
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#",number = 20)
	public void method3() {
		System.out.println("���� ����3");
	}
	
	@PrintAnnotation(number = 50)
	public void method5() {
		System.out.println("���� ����5");
	}
	
	public void method4() { //�̰� �ƹ��͵� �ȳ��� ���� ���� ������̼� ���ݾ�?
		System.out.println("���� ����4");
	}
	
	
}
