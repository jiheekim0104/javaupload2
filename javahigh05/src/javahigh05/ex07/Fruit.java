package javahigh05.ex07;

public class Fruit {
	// imple 안하면 , 어떤걸 기준으로해서 넣을지 몰라서 예외발생하겠지! 근데 여기서 compareTo를 오버라이딩 할수 없다면(= 이 클래스를 고칠수 없는 경우라면!) 새로운 인터페이스 구현이 필요하다!
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
