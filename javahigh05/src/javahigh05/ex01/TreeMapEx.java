package javahigh05.ex01;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);

		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		Iterator<Entry<String, Integer>> iteratorEntry = entrySet.iterator();
		while (iteratorEntry.hasNext()) {
			Entry<String, Integer> iteratorEntryEle = iteratorEntry.next();
			System.out.println(iteratorEntryEle.getKey() + " " + iteratorEntryEle.getValue());
		}
		System.out.println("---------------");
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println(entry.getKey() + " " + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println(entry.getKey() + " " + entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println(entry.getKey() + " " + entry.getValue());
		entry = treeMap.higherEntry("ever");
		System.out.println(entry.getKey() + " " + entry.getValue());
		
		System.out.println("-1--------------");
		
		NavigableMap<String, Integer> desecdingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> desecdingEntrySet = desecdingMap.entrySet();
		for(Entry<String, Integer> desecdingEntrySeEle : desecdingEntrySet) {
			System.out.println(desecdingEntrySeEle.getKey()+" "+desecdingEntrySeEle.getValue());
		}
		System.out.println("-2--------------");
		NavigableSet<String> desecdingSet = treeMap.descendingKeySet();
		for(String text : desecdingSet) {
			System.out.println(text+" "+treeMap.get(text));
		}
		System.out.println("-3--------------");
		NavigableMap<String, Integer> subMap = treeMap.subMap("c", true, "h", true);
		for(Entry<String, Integer> subEntry : subMap.entrySet()) {
			System.out.println(subEntry.getKey()+" "+subEntry.getValue());
		}
		

		
//		for(Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry.getKey()+"-"+entry.getValue());
//		}

//		Scanner scanner = new Scanner(System.in);
//		String text = scanner.nextLine();
//		iteratorEntry = entrySet.iterator();
//		while (iteratorEntry.hasNext()) {
//			Entry<String, Integer> iteratorEntryEle = iteratorEntry.next();
//			if (text.equals(iteratorEntryEle.getKey())) {
//				System.out.println(iteratorEntryEle.getValue());
//			}
//		}

	}

}
