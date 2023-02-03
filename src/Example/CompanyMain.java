package Example;

import java.util.Scanner;

public class CompanyMain {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in); 
		
		//CompanyService
		CompanyService cs = new CompanyService();
		
		//while탈출
		boolean bo = true;
		
		//직원관리 프로그램을 종료전가지 반복 동작 시키기 위해 사용
		
		while(bo) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			
			//switch key입력
			int key = sc.nextInt();
			
			//원하는 case 입력 key 널어주기
			switch (key) {
			case 1:
				cs.saveWorker();
				break;
				
			case 2:
				cs.search();
				break;
				
			case 3:
				//cs.list();
				bo = false;
				System.out.println("프로그램 종료");
				break;
				
			case 4:
				cs.list();
				break;
 
			default:
				break;
			}
			
			

		}
		
	}

}
