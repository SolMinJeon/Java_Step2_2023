package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int a = sc.nextInt();
		
		
		Guide gu = new Guide(a);
		//Guest ge = new Guest();
		
		for(int i=0; i<a; i++) {
			System.out.print((i+1) + ". 이름 : ");
			String name = sc.next();
			gu.guest[i].setName(name);
			
			System.out.print((i+1) + ". 성별 : ");
			gu.guest[i].setGender(sc.next());
			System.out.println("--------------------------");
		}
		
		
		boolean tf = true;
		while(tf) {
			
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			
			int num = sc.nextInt();
			
			
			switch (num) {
			case 1:
				for(int i=0; i<a; i++) {
					System.out.println((i+1) + ". 이름 : " + gu.guest[i].getName());
					System.out.println((i+1) + ". 성별 : " + gu.guest[i].getGender());
					System.out.println((i+1) + ". 목적지 : " + Guide.point);
					System.out.println("--------------------------------------");
				}
				break;
				
			case 2:
				System.out.print("어디로 변경하시겠습니까 : " );
				Guide.point = sc.next();
				System.out.println(Guide.point + "로 목적지변경");
				break;
				
			case 3:
				System.out.println("종료");
				tf = false;
				break;

			default:
				System.out.println("다시선택");
				break;
			}
			System.out.println("========================================");
			
		}
	}

}
