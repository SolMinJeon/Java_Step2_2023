package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder p1 = new Powder();
		printer.setMeterial(p1);
		System.out.println(p1);
		
		Powder p2 = (Powder)printer.getMeterial();
		System.out.println(p2);
		
		Plastic p3 = new Plastic();
		printer.setMeterial(p3);
		System.out.println(p3);
		
		Plastic p4 = (Plastic)printer.getMeterial();
		System.out.println(p4);
		
	}

}
