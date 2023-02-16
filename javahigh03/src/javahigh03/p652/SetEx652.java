package javahigh03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		Set<Member> memberSet = new HashSet<Member>();
		memberSet.add(new Member("김지희", 30));
		memberSet.add(new Member("진양철", 75));
		memberSet.add(new Member("진도준", 5));
		memberSet.add(new Member("김지희", 30)); // 동등객체 메소드들 오버라이딩안하면 그대로 추가가됨 ㅇㅇ 지금은 따로 설정해놨기때문에 또한번 뜨지않아!
		memberSet.add(new Member("진양철", 70));

		Iterator<Member> memberIterator = memberSet.iterator();
		while(memberIterator.hasNext()) {
			// System.out.println(it.next()); 들어있는 해쉬코드의 값이 찍힘
			Member memberAddr = memberIterator.next();
			System.out.println(memberAddr.getName()+ memberAddr.getAge());
		}
		
		
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(new Animal("강아지", 15));
		animalSet.add(new Animal("고양이", 10));
		animalSet.add(new Animal("토끼", 7));
		animalSet.add(new Animal("닭", 3));
		animalSet.add(new Animal("닭", 3));
		animalSet.add(new Animal("닭", 1));
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
		shopSet.add(new Shop("진화영","1234", 245));
		shopSet.add(new Shop("남경진","0002", 25));
		shopSet.add(new Shop("심으뜸","5784", 4845));
		shopSet.add(new Shop("추성훈","5234", 275));
		shopSet.add(new Shop("황여울","1144", 75));
		shopSet.add(new Shop("진화영","1234", 245));
		shopSet.add(new Shop("진화영","1234", 245));
		
		for(Shop shop : shopSet) {
			System.out.println(shop.getCustName() +"|"+shop.getCustPhone()+"|"+shop.getPoint());
		}
		
//		Scanner scanner = new Scanner(System.in);
//		String searchName = scanner.nextLine();
//		String searchPhone = scanner.nextLine();
		String searchName = "진화영";
		String searchPhone = "1234";
		
		boolean isFinded = false;
		while(!isFinded) {
			for(Shop shop : shopSet) {
				if(shop.getCustName().equals(searchName) && shop.getCustPhone().equals(searchPhone)) {
					System.out.println(shop.getPoint());
					isFinded = true;
				} 
			}
			if(!isFinded)System.out.println("찾는 사람이 없습니다.");
			break;
		}
		
		
		
	}

}
