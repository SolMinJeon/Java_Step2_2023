package chapter10;

import java.util.Scanner;

public class CalculatorExamMain {
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}
	//CalculatorExam a = new CalPlus();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//System.out.println("CalPlus : "+new CalPlus().getResult(a, b));
		//System.out.println("CalMinus : "+new CalMinus().getResult(a, b));
		
		/*
		//getClass().getSimpleName() : 클래스명 가져오기
		CalculatorExam calculators[] = {new CalPlus(), new CalMinus()};
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/
		int p = calc(new CalPlus(), a, b);
		int m = calc(new CalMinus(), a, b);
		System.out.println("CalPlus : " + p);
		System.out.println("CalMinus : " + m);

	}

}
