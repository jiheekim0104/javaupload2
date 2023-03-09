package javaCh17.p729;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		for(int i = 1;i<=5;i++) {
			Product product = new Product(i, "��ǰ"+i, "���� ȸ��", (int)(1000*Math.random()));
			list.add(product);
		}
		
		Stream<Product> stream = list.stream();
		stream.forEach(product -> System.out.println(product));
	}
}
