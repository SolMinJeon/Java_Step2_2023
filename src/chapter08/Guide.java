package chapter08;

import java.util.Scanner;

public class Guide {
	
	static String point;
	Guest[] guest;
	
	Scanner sc = new Scanner(System.in);
	//생성자 초기화
	public Guide(int n) {
		point = "발리";
		guest = new Guest[n];
		
		
		//객체 생성
		for(int i=0; i<guest.length; i++) {
			guest[i] = new Guest();
		}
		
		
	}
	
	
	
	
	public void asd() {
		
		for(int i=0; i<guest.length; i++) {
			System.out.print((i+1) + ". 이름 : ");
			String name = sc.next();
			guest[i].setName(name);
			System.out.print((i+1) + ". 성별 : ");
			guest[i].setGender(sc.next());
			System.out.println("--------------------------");
		}
		
		
		
		
	}
	
	public void wasd() {
		boolean tf = true;
		while(tf) {
			
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			
			int num = sc.nextInt();
			
			
			switch (num) {
			case 1:
				for(int i=0; i<guest.length; i++) {
					System.out.println((i+1) + ". 이름 : " + guest[i].getName());
					System.out.println((i+1) + ". 성별 : " + guest[i].getGender());
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
