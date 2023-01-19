package chapter13;

class Outter2{
	//방법1
	//익명의 클래스는 인스턴스 이름이 없다	
	Runnable getRunnable(int i) {
		int num = 100;
		//new 와 동시에 부모 클래스의 run 메소드를 상속받으므로 추상 메ㅐ소드인 run을 반드시 오버라이딩 해서 사용한다
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			
			}
		};
	}
	//방봅2
	Runnable runner = new Runnable() {	
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명의 클래스 변수");
		}
	};
	
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();//방법1
		out.runner.run();//방법2

	}

}
