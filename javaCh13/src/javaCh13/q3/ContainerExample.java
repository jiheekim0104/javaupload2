package javaCh13.q3;


public class ContainerExample {

	public static void main(String[] args) {
		Container<String,String> container1 = new Container<String, String>();
		container1.setNameJob("ȫ�浿", "����");
		String name1 = container1.getName();
		String job = container1.getJob();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.setNameAge("ȫ�浿", 35);
		String name2 = container2.getName();
		Integer age = container2.getAge();

	}

}
