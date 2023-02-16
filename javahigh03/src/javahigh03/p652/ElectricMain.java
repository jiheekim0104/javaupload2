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
		System.out.print("찾으려는 호수를 입력하세요: ");
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
			System.out.println("찾으시는 호수가 없습니다.");
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
				maxUsingAddr = electric; //여기서 주소를 넘겨줄수도있다! 
			}
			if(minUsingFee>=electric.getUsingElectricFee()) {
				minUsingFee =electric.getUsingElectricFee(); // 최저값을 찾아서, 
//				minUsingFeeAddr = electric; //만약 주소를 넘기는 방식을 쓴다면.. 
			}
		}
		System.out.println("최고 요금:"+maxUsingAddr.getHomeNumber()+"|"+maxUsingAddr.getFamilyCnt()); // 주소를 넘겨준 경우 출력
//		System.out.println("최저 요금(500원추가):"+minUsingFeeAddr.getHomeNumber()+"|"+(minUsingFeeAddr.getUsingElectricFee()+500)); 이렇게 한개밖에 안나온다! 
		
		for(Electric electric : electricSet) { //최저값을 가지는 호수를 찾아서 돈을 추가해주는 방식
			if(minUsingFee==electric.getUsingElectricFee()) {
				System.out.println("최저 요금(500원추가):"+electric.getHomeNumber()+"|"+(electric.getUsingElectricFee()+500));
				electric.setUsingElectricFee(electric.getUsingElectricFee()+500);
			}
		}
		
		int sumUsingElectric =0;
		int sumUsingElectricFee=0;
		for(Electric electric : electricSet) {
			sumUsingElectric += electric.getUsingElectric();
			sumUsingElectricFee += electric.getUsingElectricFee();
		}
		System.out.println("전기사용량 평균: "+sumUsingElectric/electricSet.size());
		System.out.println("전기사용금액량 평균: "+sumUsingElectricFee/electricSet.size());
		
		
		
		
	}

}
