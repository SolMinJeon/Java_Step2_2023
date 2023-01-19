package chapter16.generic2;

public class GenericPrinterMain {
	
	public static void main(String[] args) {
		
		GenericPrinter<Powder> v1 = new GenericPrinter<Powder>();
		v1.setMeterial(new Powder());
		System.out.println(v1.getMeterial());
		new Powder().doprinting();
		
		
		GenericPrinter<Plastic> v2 = new GenericPrinter<>();
		Plastic pl = new Plastic();
		v2.setMeterial(pl);
		pl = v2.getMeterial();
		System.out.println(pl);
		pl.doprinting();
		
		//물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다
		Water water = new Water();
		water.doprinting();
		/*
		GenericPrinter<Water> v3 = new GenericPrinter<>();
		v3.setMeterial(new Water());
		System.out.println(v3.getMeterial());
		*/
		
	}

}
