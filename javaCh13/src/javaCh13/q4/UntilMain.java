package javaCh13.q4;

public class UntilMain {

	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<String, Integer>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);

		ChildPair<String,Integer> childPair = new ChildPair<String, Integer>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���");
		System.out.println(childAge);
	}

}

class Util<T>{
//	public T kind;
//	
//	public Util(T kind) {
//		this.kind = kind;
//	}
//	
//	public static Integer getValue(Pair pair, String name){
//		if(pair.getKey().equals(name)) {
//			return (Integer) pair.getValue();
//		}
//		return null;
//	}
//	
//	
//	public static Integer getValue(ChildPair childPair, String name){
//		if(childPair.getKey().equals(name)) {
//			return (Integer) childPair.getValue();
//		}
//		return null;
//	}
//	Base 7���� ����Ѱ� ��������?
	static <P extends Pair<K,V>,K,V> V getValue(P p, K k) { //<�ڷ����� P��°��ϳ�, K,V���� �� ������ ǥ����> ����Ÿ���� V�� �ڿ��� �޼ҵ���
		if(p.getKey()==k) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
}
