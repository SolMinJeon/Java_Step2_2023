package chapter11;

import java.util.Scanner;

public class Actor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"},
				{ "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"},
				{ "[이병헌]", "지아이조", "레드", "광해"} };
		
		System.out.print("검색할 배우 : ");
		String an = sc.next();
		
		int cnt = 0;
		/*
		if(an.equals("송강호")) {
			
			for(int i=0; i<actor[0].length; i++) {
				System.out.println(actor[0][i]);
			}
			
		} else if(an.equals("김수현")) {
			
			for(int i=0; i<actor[1].length; i++) {
				System.out.println(actor[1][i]);
			}
			
		} else if(an.equals("이병헌")) {
			
			for(int i=0; i<actor[2].length; i++) {
				System.out.println(actor[2][i]);
			}
			
		} else {
			System.out.println("해당배우가 존재하지 않습니다");
		}
		*/
		
		for(int i=0; i<actor.length; i++) {
			if(actor[i][0].equals("["+an+"]")) {
				for(int j=0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			} else {
				cnt++;
				if(cnt>=actor.length) {
					System.out.println("해당배우가 존재하지 않습니다");
				}
			}
		}

	}

}
