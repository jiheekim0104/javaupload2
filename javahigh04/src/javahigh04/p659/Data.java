package javahigh04.p659;

public class Data {
	private Shop shop;
	private int point;
	private String address;
	public Data(int point, String address) {
		super();
		this.point = point;
		this.address = address;
	}
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
