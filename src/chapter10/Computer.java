package chapter10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 메소드 areacircle 실행");
		
		return Math.PI*r*r;
	}
	
	

}
