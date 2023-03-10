package javahigh05.ex06;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CompanyMain {

	public static void main(String[] args) {
		TreeMap<String, Data> companyTreeMap = new TreeMap<String, Data>();
		
		companyTreeMap.put("강북영업", new Data("서울본부", "백화점", 4460));
		companyTreeMap.put("강서영업", new Data("서울본부", "쇼핑몰", 6800));
		companyTreeMap.put("강남영업", new Data("서울본부", "백화점", 5580));
		companyTreeMap.put("강동영업", new Data("서울본부", "쇼핑몰", 3560));
		
		Set<String> companyKeySet = companyTreeMap.keySet();
		for(String companyName : companyKeySet) {
			Data companyAddr = companyTreeMap.get(companyName);
			System.out.println(companyName + " " +companyAddr.getSale() + companyAddr.getPosition() + companyAddr.getAttach() );
		}
		System.out.println("-----------------");
		NavigableMap<String, Data> descendingMap = companyTreeMap.descendingMap();
		Set<String> descendingcompanyKeySet = descendingMap.keySet();
		for(String companyName : descendingcompanyKeySet) {
			Data companyAddr = companyTreeMap.get(companyName);
			System.out.println(companyName + " " +companyAddr.getSale() + companyAddr.getPosition() + companyAddr.getAttach() );
		}
		System.out.println("-----------------");
		System.out.print("찾으려는 부서명 이름을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String searchDepartment = scanner.nextLine();
		for(String companyName : companyKeySet) {
			if(searchDepartment.equals(companyName)) {
				Data companyAddr = companyTreeMap.get(companyName);
				System.out.println(companyAddr.getSale() + companyAddr.getPosition() + companyAddr.getAttach() );
			}	
		}
		System.out.println("-----------------");
		int sum = 0;
		for(String companyName : companyKeySet) {
			Data companyAddr = companyTreeMap.get(companyName);
			sum +=companyAddr.getSale();
		}
		System.out.println("총 합:"+ sum);
		System.out.println("-----------------");
		String bestCompanyName = null;
		int bestSale = 0;
		for(String companyName : companyKeySet) {
			Data companyAddr = companyTreeMap.get(companyName);
			if(companyAddr.getSale()>bestSale) {
				bestSale = companyAddr.getSale();
				bestCompanyName = companyName;
			}
		}
		System.out.println("최다 판매 부서명:"+ bestCompanyName);
		
		scanner.close();
	}

}
