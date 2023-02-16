package javahigh03.p652;

public class Electric {
	private String homeNumber;
	private int familyCnt;
	private int usingElectric;
	private int usingElectricFee;
	
	public Electric(String homeNumber, int familyCnt, int usingElectric, int usingElectricFee) {
		super();
		this.homeNumber = homeNumber;
		this.familyCnt = familyCnt;
		this.usingElectric = usingElectric;
		this.usingElectricFee = usingElectricFee;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getFamilyCnt() {
		return familyCnt;
	}

	public void setFamilyCnt(int familyCnt) {
		this.familyCnt = familyCnt;
	}

	public int getUsingElectric() {
		return usingElectric;
	}

	public void setUsingElectric(int usingElectric) {
		this.usingElectric = usingElectric;
	}

	public int getUsingElectricFee() {
		return usingElectricFee;
	}

	public void setUsingElectricFee(int usingElectricFee) {
		this.usingElectricFee = usingElectricFee;
	}

	@Override
	public int hashCode() {
		return homeNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Electric) {
			Electric electric = (Electric)obj;
			return electric.homeNumber.equals(homeNumber);
		}
		return false;
	}
	
	
}
