package chapter13;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//생성자
	
	//메소드
	
	//내부 클래스
	class Inner {
		//필드명
		
		//생성자
		
		//메소드
		public void printData() {
			System.out.println(a + b + c);
		}
	}
	
	public static void main(String[] args) {
		//외부
		//MemberInner o = new MemberInner();
		//내부
		//MemberInner.Inner i = o.new Inner();
		
		MemberInner.Inner in = new MemberInner().new Inner();
		
		in.printData();
		
	}

}
