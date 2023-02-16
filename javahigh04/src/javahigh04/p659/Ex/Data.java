package javahigh04.p659.Ex;

public class Data {
	
	private String roomNumber;
	private int studentCnt;
	
	public Data(String roomNumber, int studentCnt) {
		super();
		this.roomNumber = roomNumber;
		this.studentCnt = studentCnt;
	}

	

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}
	
	
}
