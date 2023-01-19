package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item { Start, Pause, Exit } // 0 1 2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] : ");
			
			int a = sc.nextInt();
			
			Item start = Item.Start; //start에 0
			Item pause = Item.Pause; //start에 0
			Item exit = Item.Exit; //start에 0
			
			if(a == start.ordinal()) {
				System.out.println("게임이 시작함");
			} else if(a == pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			} else {
				System.out.println("게임이 종료됨");
				return; //나감 break 종료
			}
			
		}

	}

}
