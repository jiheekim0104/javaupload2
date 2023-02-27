package javaCh13.Ex01;

public class BaseEx02 {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		Tv tv1 = product1.getKind();
		System.out.println(tv1);
		product1.setModel("스마트TV");
		System.out.println(product1.getModel());
	
		
		
		Product<Tv, Integer> product2 = new Product<Tv, Integer>();
		product2.setKind(new Tv());
		product2.setPrice(5000000);

		if (product2.getKind().toString().equals("TV") && product2.getPrice() >= 5000000) {
			System.out.println("차라리 자동차를 사지..");
		}
		
		Product<Car, Integer> product3 = new Product<Car, Integer>();
		product3.setKind(new Car());
		product3.setPrice(10000000);
		
		if (product3.getKind().toString().equals("자동차") && product3.getPrice() >= 10000000) {
			System.out.println("난 조금더 돈 모아서 자동차 살거야..");
		} 

	}

}

class Product<K, M> {
	private K kind;
	private M model;
	private M price;

	public M getPrice() {
		return price;
	}

	public void setPrice(M price) {
		this.price = price;
	}

	public K getKind() {
		return kind;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}

class Tv {
	@Override
	public String toString() {
		return "TV";
	}
}

class Car {
	@Override
	public String toString() {
		return "자동차";
	}
}
