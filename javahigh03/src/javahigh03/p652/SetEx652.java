package javahigh03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		Set<Member> memberSet = new HashSet<Member>();
		memberSet.add(new Member("������", 30));
		memberSet.add(new Member("����ö", 75));
		memberSet.add(new Member("������", 5));
		memberSet.add(new Member("������", 30)); // ���ü �޼ҵ�� �������̵����ϸ� �״�� �߰����� ���� ������ ���� �����س��⶧���� ���ѹ� �����ʾ�!
		memberSet.add(new Member("����ö", 70));

		Iterator<Member> memberIterator = memberSet.iterator();
		while(memberIterator.hasNext()) {
			// System.out.println(it.next()); ����ִ� �ؽ��ڵ��� ���� ����
			Member memberAddr = memberIterator.next();
			System.out.println(memberAddr.getName()+ memberAddr.getAge());
		}
		
		
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(new Animal("������", 15));
		animalSet.add(new Animal("�����", 10));
		animalSet.add(new Animal("�䳢", 7));
		animalSet.add(new Animal("��", 3));
		animalSet.add(new Animal("��", 3));
		animalSet.add(new Animal("��", 1));
		System.out.println("-----------------------------");
		for(Animal animal : animalSet) {
			System.out.println(animal.getKind() + animal.getLifeSpan());
		}
		System.out.println("-----------------------------");
		Iterator<Animal> animalIterator = animalSet.iterator();
		while(animalIterator.hasNext()) {
		Animal animalAddr = animalIterator.next();
			System.out.println(animalAddr.getKind()+" "+ animalAddr.getLifeSpan());
		}
		
		System.out.println("-----------------------------");
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add(new Shop("��ȭ��","1234", 245));
		shopSet.add(new Shop("������","0002", 25));
		shopSet.add(new Shop("������","5784", 4845));
		shopSet.add(new Shop("�߼���","5234", 275));
		shopSet.add(new Shop("Ȳ����","1144", 75));
		shopSet.add(new Shop("��ȭ��","1234", 245));
		shopSet.add(new Shop("��ȭ��","1234", 245));
		
		for(Shop shop : shopSet) {
			System.out.println(shop.getCustName() +"|"+shop.getCustPhone()+"|"+shop.getPoint());
		}
		
//		Scanner scanner = new Scanner(System.in);
//		String searchName = scanner.nextLine();
//		String searchPhone = scanner.nextLine();
		String searchName = "��ȭ��";
		String searchPhone = "1234";
		
		boolean isFinded = false;
		while(!isFinded) {
			for(Shop shop : shopSet) {
				if(shop.getCustName().equals(searchName) && shop.getCustPhone().equals(searchPhone)) {
					System.out.println(shop.getPoint());
					isFinded = true;
				} 
			}
			if(!isFinded)System.out.println("ã�� ����� �����ϴ�.");
			break;
		}
		
		
		
	}

}
