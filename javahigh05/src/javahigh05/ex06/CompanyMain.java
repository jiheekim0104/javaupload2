package javahigh05.ex06;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CompanyMain {

	public static void main(String[] args) {
		TreeMap<String, Data> companyTreeMap = new TreeMap<String, Data>();
		
		companyTreeMap.put("���Ͽ���", new Data("���ﺻ��", "��ȭ��", 4460));
		companyTreeMap.put("��������", new Data("���ﺻ��", "���θ�", 6800));
		companyTreeMap.put("��������", new Data("���ﺻ��", "��ȭ��", 5580));
		companyTreeMap.put("��������", new Data("���ﺻ��", "���θ�", 3560));
		
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
		System.out.print("ã������ �μ��� �̸��� �Է��ϼ���: ");
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
		System.out.println("�� ��:"+ sum);
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
		System.out.println("�ִ� �Ǹ� �μ���:"+ bestCompanyName);
		
		scanner.close();
	}

}