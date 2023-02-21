package javahigh05.ex09;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
//		System.out.println(coinBox.pop().getValue());
//		System.out.println(coinBox.pop().getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ����: "+ coin.getValue()+"��");
		}
		
		
		Stack<Car> parkingCar = new Stack<Car>();
		
		parkingCar.push(new Car("�ҳ�Ÿ"));
		parkingCar.push(new Car("����"));
		parkingCar.push(new Car("�׷���"));
		parkingCar.push(new Car("Ƽ��"));
		parkingCar.push(new Car("K5"));
		
		while(!parkingCar.isEmpty()) {
			Car car = parkingCar.pop();
			System.out.println(car.getCarKind() + " �����մϴ�.");
		}
	}

}
