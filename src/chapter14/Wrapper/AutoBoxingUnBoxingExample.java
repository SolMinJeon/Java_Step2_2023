package chapter14.Wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AutoBoxing
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		//obj를 언박싱으로 자동 변환
		int value = obj;
		System.out.println(value);
		
		//연산시 자동unboxing
		int result = obj + 100;
		System.out.println(result);
		
		

	}

}
