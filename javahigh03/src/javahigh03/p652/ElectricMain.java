package javahigh03.p652;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElectricMain {

	public static void main(String[] args) {
		Set<Electric> electricSet = new HashSet<Electric>();
		electricSet.add(new Electric("502", 1, 423, 25000));
		electricSet.add(new Electric("303", 7, 724, 35000));
		electricSet.add(new Electric("403", 2, 222, 40000));
		electricSet.add(new Electric("503", 2, 438, 25000));
		electricSet.add(new Electric("503", 3, 171, 35000));
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ã������ ȣ���� �Է��ϼ���: ");
		String findHomeNumber = scanner.nextLine();
		boolean isFinded = false;
		while(!isFinded) {
			for(Electric electric : electricSet) {
				if(findHomeNumber.equals(electric.getHomeNumber())){
					System.out.println(electric.getUsingElectric());
					isFinded = true;
				}
				
			}
		if(!isFinded) {
			System.out.println("ã���ô� ȣ���� �����ϴ�.");
			break;
		}	
		}
		
		int maxUsing = 0;
		Electric maxUsingAddr = null;
//		Electric minUsingFeeAddr = null;
		int minUsingFee = Integer.MAX_VALUE;
		for(Electric electric : electricSet) {
			if(maxUsing<=electric.getUsingElectric()) {
				maxUsing =electric.getUsingElectric();
				maxUsingAddr = electric; //���⼭ �ּҸ� �Ѱ��ټ����ִ�! 
			}
			if(minUsingFee>=electric.getUsingElectricFee()) {
				minUsingFee =electric.getUsingElectricFee(); // �������� ã�Ƽ�, 
//				minUsingFeeAddr = electric; //���� �ּҸ� �ѱ�� ����� ���ٸ�.. 
			}
		}
		System.out.println("�ְ� ���:"+maxUsingAddr.getHomeNumber()+"|"+maxUsingAddr.getFamilyCnt()); // �ּҸ� �Ѱ��� ��� ���
//		System.out.println("���� ���(500���߰�):"+minUsingFeeAddr.getHomeNumber()+"|"+(minUsingFeeAddr.getUsingElectricFee()+500)); �̷��� �Ѱ��ۿ� �ȳ��´�! 
		
		for(Electric electric : electricSet) { //�������� ������ ȣ���� ã�Ƽ� ���� �߰����ִ� ���
			if(minUsingFee==electric.getUsingElectricFee()) {
				System.out.println("���� ���(500���߰�):"+electric.getHomeNumber()+"|"+(electric.getUsingElectricFee()+500));
				electric.setUsingElectricFee(electric.getUsingElectricFee()+500);
			}
		}
		
		int sumUsingElectric =0;
		int sumUsingElectricFee=0;
		for(Electric electric : electricSet) {
			sumUsingElectric += electric.getUsingElectric();
			sumUsingElectricFee += electric.getUsingElectricFee();
		}
		System.out.println("�����뷮 ���: "+sumUsingElectric/electricSet.size());
		System.out.println("������ݾ׷� ���: "+sumUsingElectricFee/electricSet.size());
		
		
		
		
	}

}
