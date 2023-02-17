package javahighEx05;

public class Company {
	//부서명 키  소속 매장 판매 베률 
	private String department; // 부서명 (키)
	private Data data;
	
	public Company(String department, Data data) {
		super();
		this.department = department;
		this.data = data;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	
}
