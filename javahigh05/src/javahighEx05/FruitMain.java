package javahighEx05;

import java.util.TreeSet;

public class FruitMain {
	public static void main(String[] args) {
		TreeSet<Fruit> fruitTreeSet = new TreeSet<Fruit>(new FruitComparator()); // 맨 뒤에 new로 구현객체 가져올것
		
		fruitTreeSet.add(new Fruit("포도", 3000));
		fruitTreeSet.add(new Fruit("수박", 10000));
		fruitTreeSet.add(new Fruit("딸기", 6000));
		fruitTreeSet.add(new Fruit("배", 3000));
		fruitTreeSet.add(new Fruit("샤인머스켓", 8000));
		
		// 왜 처음부터 3000을 비교해서 들어갈까?
		// 삽입하는 순서는? 근노드부터 시작하는게 맞는가 ?
	}
}
