package javahigh05.ex01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(4);
		treeSet.add(7);
		treeSet.add(4);
		treeSet.add(0);
		treeSet.add(8);
		treeSet.add(9);
		treeSet.add(2);
		
		System.out.println("제일 작은 숫자: "+ treeSet.first());
		System.out.println("제일 큰 숫자: "+ treeSet.last());
		System.out.println("7보다 바로 아래 객체: "+treeSet.lower(7));
		System.out.println("2보다 바로 위 객체: "+treeSet.higher(2));
		System.out.println(treeSet.floor(3));
		System.out.println(treeSet.ceiling(5));
//		System.out.println(treeSet.pollFirst());
//		System.out.println(treeSet.pollLast());
		System.out.println(treeSet);
		Iterator<Integer> iteratorOld = treeSet.iterator();
		while(iteratorOld.hasNext()) {
			int number = iteratorOld.next();
			System.out.print(number);
		}
		System.out.println();
		Iterator<Integer> iteratorNew = treeSet.descendingIterator();
		while (iteratorNew.hasNext()) {
			int number = iteratorNew.next();
			System.out.print(number);
		}
		System.out.println();
		
		System.out.println(treeSet.descendingSet());
		
		SortedSet<Integer> iteratorhead = treeSet.headSet(8);
		System.out.println(iteratorhead);
		
		SortedSet<Integer> iteratortail = treeSet.tailSet(7);
		System.out.println(iteratortail);
		
		SortedSet<Integer> iteratorsub = treeSet.subSet(2,true,7,true);
		System.out.println(iteratorsub);
		
	}

}
