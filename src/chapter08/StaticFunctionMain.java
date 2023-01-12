package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction sf = new StaticFunction();
		
		String a = sf.str2;
		System.out.println(a);
		
		String b = sf.getStatic();
		System.out.println(b);
		
		//static 메소드는 클래스명으로 접근이 가능
		String str;
		str = StaticFunction.getStatic();
		System.out.println(str);

	}

}
