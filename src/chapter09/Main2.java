package chapter09;

import java.util.Arrays;
import java.util.Scanner;

public class Main2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String l = sc.next();
//		String tkn[] = l.split(", ");
//        int k = Integer.valueOf(tkn[0]);
//        int d = Integer.valueOf(tkn[1]);
//        int a = Integer.valueOf(tkn[2]);
		
		int so = sc.nextInt();
		
		switch ((int)so/10) {
		case 0:
			System.out.println("0~9");
			break;
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		case 3:
			System.out.println("30~39");
			break;
		default:
			System.out.println("wasd");
			break;
		}
		
	}	
}