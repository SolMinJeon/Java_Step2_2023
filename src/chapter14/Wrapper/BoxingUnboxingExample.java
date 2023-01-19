package chapter14.Wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		
		Integer total1 = obj1 + obj2;
		Integer total2 = obj2 + obj3;
		
		System.out.println(total1);
		System.out.println(total2);
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		Integer total3 = value1 + value2;
		Integer total4 = value2 + value3;
		
		System.out.println();
		System.out.println(total3);
		System.out.println(total4);
		
		

	}

}
