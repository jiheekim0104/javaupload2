package javahigh03.p652;

public class Shop {
	private String custName;
	private String custPhone;
	private int point;
	
	
	public Shop(String custName, String custPhone, int point) {
		super();
		this.custName = custName;
		this.custPhone = custPhone;
		this.point = point;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustPhone() {
		return custPhone;
	}


	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public int hashCode() {
		return custName.hashCode()+ custPhone.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shop) {
			Shop shop = (Shop)obj;
			return shop.custName.equals(custName)&&shop.custPhone.equals(custPhone);
		}
		return false;
	}	
	
	
	
	
}
