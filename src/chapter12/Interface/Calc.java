package chapter12.Interface;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substaract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void descruption() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod(); //private method 호출
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 매서드 입니다");
	}
	private static void myStaticMethod() {
		System.out.println("private static 매서드 입니다");
	}
	
	//인터페이스
	
	/*
	 -추상메소드 : body가 없는 메소드로 무조건 재정의가 필요
	 --자바 8부터 제공--
	 -디폴트메소드 : 기본수행문을 가질수 있는 메소드이며 재정의를 할 수 있다
	 -정석(static) 메소드 : 객체 생성과 관계없이 인터타입(클래스명)으로 ㅅ용할수 있다
	 -private 메소드 : 인터페이스를 구현한 클래스에서 사용가능하고 재정의 할 수 없음
	 */
	
	

}
