package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 
		
		SmartPhone smartphone = new SmartPhone("김유신");
		
		System.out.println(smartphone.owner + "님");
		smartphone.turnOn();
		smartphone.intersearch();
		smartphone.turnOff();

	}

}
