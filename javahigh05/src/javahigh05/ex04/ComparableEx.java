package javahigh05.ex04;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
	
	public static void main(String[] args) {
		
//		TreeSet<Person> treeSet = new TreeSet<Person>();
//		
//		treeSet.add(new Person("??????", 30));
//		treeSet.add(new Person("??????", 34));
//		treeSet.add(new Person("??????", 80));
//		treeSet.add(new Person("????ö", 15));
//		treeSet.add(new Person("?尡??", 22));
//		treeSet.add(new Person("??????", 43));
//		
//		Iterator<Person> iterator = treeSet.iterator();
//		while(iterator.hasNext()) {
//			Person member = iterator.next();
//			System.out.println(member.getName()+" "+member.getAge());
//		}
		System.out.println("-------------------");
		TreeSet<Person> newTreeSet = new TreeSet<Person>();
		newTreeSet.add(new Person("??????", 30, 11.1));
		newTreeSet.add(new Person("??????", 34, 21.8));
		newTreeSet.add(new Person("??????", 80, 33.1));
		newTreeSet.add(new Person("????ö", 15, 94.1));
		newTreeSet.add(new Person("?尡??", 22, 17.4));
		newTreeSet.add(new Person("??????", 43, 83.1));
		
		Iterator<Person> iterator = newTreeSet.iterator();
		while(iterator.hasNext()) {
			Person member = iterator.next();
			System.out.println(member.getName()+" "+member.getAge()+" "+member.getScore());
		}
	}	
}
