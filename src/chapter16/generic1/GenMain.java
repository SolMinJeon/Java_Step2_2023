package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {

		Gen gen = new Gen();
		
		//정수형
		Integer iArr[] = {1, 2, 3, 4, 5};
		Double dArr[] = {1.1, 2.1, 3.1, 4.1, 5.1};
		Character cArr[] = {'a', 'b', 'c', 'd', 'e'};
		
		gen.printArr(iArr);
		System.out.println();
		gen.printArr(dArr);
		System.out.println();
		gen.printArr(cArr);

	}

}
