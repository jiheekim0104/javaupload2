package javaCh13.Ex01;

public class BaseEx03 {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car1 car = carAgency.rent();
		car.run();

	}

}

interface Rentable<P>{
	P rent();
}

class Home{
	void turnOnLight() {
		System.out.println("전등을 켭니다.");
	}
}

class Car1{
	void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}

class CarAgency implements Rentable<Car1>{
	@Override
	public Car1 rent() {
		return new Car1();
	}
}