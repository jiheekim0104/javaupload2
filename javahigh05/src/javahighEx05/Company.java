package javahighEx05;

public class Company {
	//�μ��� Ű  �Ҽ� ���� �Ǹ� ���� 
	private String department; // �μ��� (Ű)
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
