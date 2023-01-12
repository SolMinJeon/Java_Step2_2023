package chapter08;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk1 = new Bank("강남", "010-1111-2222");
//		bk1.interest = 0.2f;
		Bank.interest = 0.2f;
		bk1.getBank();
		System.out.println("---------------------------");
		
		Bank bk2 = new Bank("일산", "010-1111-4444");
		bk2.getBank();
		String point =null;
		String tel =null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		point = sc.next();
		tel = sc.next();
		Bank bank = new Bank(point, tel);
		System.out.print(point + "의 이자를 입력하세요 : ");
		Bank.interest = sc.nextFloat();
		bank.getBank();

	}

}
