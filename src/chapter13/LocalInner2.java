package chapter13;

class Outter {
	//외부 클래스 맴버변수
	int outNum = 100;
	static int sNum = 200;
	
	//Runnable 매개변수와 맴버변수는 final로 정의
	//Runnable Data영역
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		class MyRunnable implements Runnable {
			
			int localNum = 10; //내부클래스의 맴버변수
			@Override
			public void run() {
				//num = 200;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum(외부) = " + outNum);
				
				System.out.println("outer.sNum(외부 Data영역) = " + Outter.sNum);
				
			}
			
		}
		
		return null;
		
	}
}

public class LocalInner2 {
	
	public static void main(String[] args) {
		
	}

}
