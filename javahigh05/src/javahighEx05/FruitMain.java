package javahighEx05;

import java.util.TreeSet;

public class FruitMain {
	public static void main(String[] args) {
		TreeSet<Fruit> fruitTreeSet = new TreeSet<Fruit>(new FruitComparator()); // �� �ڿ� new�� ������ü �����ð�
		
		fruitTreeSet.add(new Fruit("����", 3000));
		fruitTreeSet.add(new Fruit("����", 10000));
		fruitTreeSet.add(new Fruit("����", 6000));
		fruitTreeSet.add(new Fruit("��", 3000));
		fruitTreeSet.add(new Fruit("���θӽ���", 8000));
		
		// �� ó������ 3000�� ���ؼ� ����?
		// �����ϴ� ������? �ٳ����� �����ϴ°� �´°� ?
	}
}