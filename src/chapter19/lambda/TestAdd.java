package chapter19.lambda;

public class TestAdd {
	
	public static void main(String[] args) {
		//Lambda : 메소드 이름이 없음 구현부만 존재함
		Add addF = (x, y) -> x + y;
		
		int a = addF.add(4, 5);
		
		System.out.println(addF.add(3, 5));
		System.out.println(a);
		
	}

}
