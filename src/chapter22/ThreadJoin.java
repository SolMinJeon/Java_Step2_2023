package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {

		System.out.println("메인클래스 시작");
		
		ThreadJoin t1 = new ThreadJoin();
		Thread jt = new Thread(t1);
		jt.start();
		
		try {
			jt.join(); //run메서드와 main메서드가 join이되어 run이 완전히 종료될때 까지 기다림(위 -> 아래)
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인클래스 종료");
		
	}
	
	
	@Override
	public void run() {
		System.out.println("run() 메소드 수행");
		first();
	}
	
	public void first() {
		System.out.println("first() 메소드 수행");
		second();
	}
	
	public void second() {
		System.out.println("second() 메소드 수행");
	}
	
	

}
