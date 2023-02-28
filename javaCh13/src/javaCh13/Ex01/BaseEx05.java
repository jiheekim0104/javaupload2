package javaCh13.Ex01;

public class BaseEx05 {

	public static void main(String[] args) {
		Box3<String> box = new Box3<String>();
		box.setT("김지희");
		System.out.println(box.getT());
		
		Box2<String,Integer> box2 = new Box2<String,Integer>("이재훈",34);
		System.out.println(box2.getS()+ box2.getT());
		
		Box2<Boolean,Box2<String,Integer>> box3 = new Box2<Boolean,Box2<String,Integer>>(true, new Box2<String,Integer>("진양철",70));
		if(box3.getS()) {
			System.out.println(box3.getT().getS()+"님은 "+box3.getT().getT()+"세 남성이므로 신검대상입니다.");
		}else {
			System.out.println("신검대상이 아닙니다.");
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
		
	
		public Box2(S s, T t) { //명시적 생성자가 만들어져있음 
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
	
	