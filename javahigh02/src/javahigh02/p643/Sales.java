package javahigh02.p643;

public class Sales {
	private String date;
	private String code;
	private String area;
	private int saleCnt;
	private int saleMoney;
	private String phone;
	
	
	public Sales(String date, String code, String area, int saleCnt, int saleMoney, String phone) {
		super();
		this.date = date;
		this.code = code;
		this.area = area;
		this.saleCnt = saleCnt;
		this.saleMoney = saleMoney;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return date+" "+code+" "+area+" "+saleCnt+" "+saleMoney+" "+phone;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}
	public int getSaleMoney() {
		return saleMoney;
	}
	public void setSaleMoney(int saleMoney) {
		this.saleMoney = saleMoney;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
