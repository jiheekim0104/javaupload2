package javaCh12.Ex01;

public class Member {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(obj.equals(member.id)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "��� Ŭ������ ���������� ����� �� �ڵ����� ���� �޼ҵ���" + id;
	}
	
	
	
	
	
	
}
