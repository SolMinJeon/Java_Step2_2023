package chapter11;

public class CarMain {
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}

	public static void main(String[] args) {
//		method(new ManualCar());
//		System.out.println("=====================");
//		method(new AiCar());
		
		Car mycar = new AiCar();
		mycar.run();
		
		Car hiscar = new ManualCar();
		hiscar.run();
		
	}

	
	
	
	
}
