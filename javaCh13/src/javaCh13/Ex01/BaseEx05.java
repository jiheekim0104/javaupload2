package javaCh13.Ex01;

public class BaseEx05 {

	public static void main(String[] args) {
		Box3<String> box = new Box3<String>();
		box.setT("������");
		System.out.println(box.getT());
		
		Box2<String,Integer> box2 = new Box2<String,Integer>("������",34);
		System.out.println(box2.getS()+ box2.getT());
		
		Box2<Boolean,Box2<String,Integer>> box3 = new Box2<Boolean,Box2<String,Integer>>(true, new Box2<String,Integer>("����ö",70));
		if(box3.getS()) {
			System.out.println(box3.getT().getS()+"���� "+box3.getT().getT()+"�� �����̹Ƿ� �Ű˴���Դϴ�.");
		}else {
			System.out.println("�Ű˴���� �ƴմϴ�.");
		}
	
		

	}
	public <A,B> void gM() {
		
	}
}
	class Box3<T>{
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}
		
		public T play() {
			return t;
		}
	}
	
	class Box2<S,T>{
		private S s;
		private T t;
		
	
		public Box2(S s, T t) { //����� �����ڰ� ����������� 
			super();
			this.s = s;
			this.t = t;
		}
		

		public S getS() {
			return s;
		}
		public void setS(S s) {
			this.s = s;
		}
		public T getT() {
			return t;
		}
		public void setT(T t) {
			this.t = t;
		}
		
	
	}
	
	