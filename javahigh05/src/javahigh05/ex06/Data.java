package javahigh05.ex06;

public class Data {
	private String attach;//�Ҽ�
	private String position; //��ġ
	private Integer sale; //�ǸŽ���
	
	public Data(String attach, String position, Integer sale) {
		super();
		this.attach = attach;
		this.position = position;
		this.sale = sale;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}
	
	
	
}
