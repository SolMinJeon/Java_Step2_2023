package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 Skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//문자를 ASCII로 형변환
			
//			char ch = sc.next().charAt(0); 
//			System.in.read() : //콘솔에 입력받기 모든 이력값을 아스키코드값
//			int a = System.in.read(); //아스키코드값
			
			String str = sc.next();
			int a = str.charAt(0);
			
			Scheduler scheduler = null;
			
			
			
			//객체 생성
			if(a == 'R' || a == 'r') {
				scheduler = new RoundRobin();
				scheduler.getNextCall();
				scheduler.sendCallToAgent();
				
			} else if(a == 'L' || a == 'l') {
				scheduler = new LeastJop();
				scheduler.getNextCall();
				scheduler.sendCallToAgent();
				
			} else if(a == 'P' || a == 'p') {
				scheduler = new PriorityAllocation();
				scheduler.getNextCall();
				scheduler.sendCallToAgent();
				
			} else if(a == 'S' || a == 's') {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("다시입력하세요");
			}
			
			
		}

	}

}
