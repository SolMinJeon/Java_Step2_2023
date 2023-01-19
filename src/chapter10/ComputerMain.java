package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		
		Computer com = new Computer();
		Calculator cal = new Calculator();
		
		System.out.println(com.areaCircle(r));
		System.out.println(cal.areaCircle(r));

	}

}
