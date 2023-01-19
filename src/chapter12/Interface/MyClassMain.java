package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {

		//X, Y MyInterface 클래스 타입의 인스턴스 변수를 선언하여 출력
		MyClass mc= new MyClass();
		X x = mc; //X 클래스 타입의 인스턴스 변수
		x.x();
		
		Y y = mc; //Y 클래스 타입의 인스턴스 변수
		y.y();
		
		MyInterface mi = mc; //MyInterface 클래스 타입의 인스턴스 변수
		mi.myMethod();
		mi.x();
		mi.y();

	}

}
