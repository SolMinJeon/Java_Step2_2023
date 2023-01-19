package chapter17.arraylist_stack_qeue;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMge() {
		int select;
		Person p;
		//int c = 0;
		ArrayList<Person> personArr = new ArrayList<>();
		boolean rr = true;
		while(rr) {
			
			System.out.println("1 . 회원추가");
			System.out.println("2 . 회원탈퇴");
			System.out.println("3 . 회원정보");
			System.out.println("4 . 종  료");
			System.out.print("항목선택 : ");
			
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			
			//if switch
			switch (select) {
			case 1:
				System.out.println("---회원추가---");
				p = new Person();
				System.out.print("이름 : ");
				p.setName(sc.next());
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				System.out.print("번호 : ");
				p.setTel(sc.next());				
				personArr.add(p);
				//personArr.add(c, p);
				//personArr.add((personArr.size() + 1), p);
				/*
				if(personArr.size() == 0) {
					personArr.add(0, p);
				} else {
					personArr.add((personArr.size() + 1), p);
				}
				*/
				//c++;
				break;
				
			case 2:
				System.out.println("---회원탈퇴---");
				for(int i=0; i<personArr.size(); i++) {
					System.out.println(i + "번 | " + personArr.get(i).toString());
				}
				System.out.print("삭제할 번호 입력 : ");
				personArr.remove(sc.nextInt());
				//c--;
				break;
				
			case 3:
				System.out.println("---회원정보---");
				for(int i=0; i<personArr.size(); i++) {
					System.out.println(i + "번 |  " + personArr.get(i).toString());
					//System.out.println(personArr.get(i).getName());
				}
				break;
				
			case 4:
				System.out.println("---종료---");
				rr = false;
				break;

			default:
				break;
			}
			System.out.println();
		}
	}

}
