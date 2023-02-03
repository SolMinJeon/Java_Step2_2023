package chapter22;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean rr = true;
		
		
		//a e i o u
		while(rr) {
			int c = 0;
			String sr = sc.nextLine();
			if(sr.equals("#")) {
				break;
			}
			
			 sr = sr.toLowerCase();
			
			for(int i=0; i<sr.length(); i++) {
				switch (sr.charAt(i)) {
				case 'a':
					c += 1;
					break;
				case 'e':
					c += 1;
					break;
				case 'i':
					c += 1;
					break;
				case 'o':
					c += 1;
					break;
				case 'u':
					c += 1;
					break;

				default:
					break;
				}
			}
			System.out.println(c);
			
		}
		
		
		
		
	}
}
