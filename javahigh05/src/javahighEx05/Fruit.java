package javahighEx05;

public class Fruit {
	// imple ���ϸ� , ��� ���������ؼ� ������ ���� ���ܹ߻��ϰ���! �ٵ� ���⼭ compareTo�� �������̵� �Ҽ� ���ٸ�(= �� Ŭ������ ��ĥ�� ���� �����!) ���ο� �������̽� ������ �ʿ��ϴ�!
	private String name;
	private Integer price;
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}