package javaCh17.p761;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectEx {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("È«±æµ¿", true, 92));
		list.add(new Student("±è¼ö¿µ", false, 87));
		list.add(new Student("±èÀÚ¹Ù", true, 93));
		list.add(new Student("¿ÀÇý¿µ", false, 93));
		
		list.stream().filter(s->s.getGender()).collect(Collectors.toList());
		
		System.out.println("---------1---------");
		Set<Student> score90list = list.stream().filter(n->n.getScore()>=90).collect(Collectors.toSet());
		for(Student s : score90list) {
			System.out.println(s.getName()+" "+s.getScore());
		}
		
		
		System.out.println("---------2---------");
		list.stream().mapToInt(n->n.getScore()).filter(n->n>=90).forEach(n->System.out.println(n));
		
		System.out.println("---------3---------");
		
		
		
		Set<Student> set = list.stream().filter(n->n.getScore()>=90).collect(Collectors.toSet());
		for(Student s : set) {
			System.out.println(s.getName()+" "+s.getScore());
		}
		
		
		System.out.println("---------4---------");
		Set<Student2> set1 = new TreeSet<Student2>();
		set1.add(new Student2("±èÁöÈñ", 30));
		set1.add(new Student2("±èÁöÈñ", 30));
		set1.add(new Student2("±èÁöÈñ", 30));
		set1.add(new Student2("ÀÌÀçÈÆ", 30));
		set1.add(new Student2("±èÁö¼ö", 27));
		System.out.println(set1.size());
		
		System.out.println("---------5---------");
		list.stream().mapToInt(n->n.getScore()).filter(n->n>=90).distinct().forEach(n->System.out.println(n));
		
		
		
	}

}
