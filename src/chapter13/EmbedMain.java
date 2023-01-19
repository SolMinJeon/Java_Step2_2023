package chapter13;

import chapter13.Out.In;

class Out2 {
	static int a = 1;
	int b;
	
	public static class In {
		String Infun() {
			return (a + "번째 static 내부 클래스");
		}
		
	}
}

public class EmbedMain {

	public static void main(String[] args) {
		Out2.In o2 = new Out2.In();
		String st = o2.Infun();
		System.out.println(st);

	}

}
