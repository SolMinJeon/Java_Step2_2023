package chapter20;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		
		int i;
		
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i); //문자
				System.out.print(i + " "); //아스키
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
