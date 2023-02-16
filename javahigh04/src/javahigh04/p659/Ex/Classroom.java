package javahigh04.p659.Ex;

public class Classroom {
	private String teachername;
	private Data data;
	
	public Classroom(String teachername, Data data) {
		super();
		this.teachername = teachername;
		this.data = data;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	
}
