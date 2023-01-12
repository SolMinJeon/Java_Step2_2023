package chapter08;

import java.util.Scanner;

public class Tour2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int a = sc.nextInt();
		
		
		Guide gu = new Guide(a);
		
		gu.asd();
		gu.wasd();
		

	}

}
