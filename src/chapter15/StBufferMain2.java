package chapter15;

public class StBufferMain2 {
	
	public static void main(String[] args) {
		String javaStr = new String("Java");
		//처음생성된 메모리의 주소
		System.out.println("javaStr의 처음생성된 메모리 주소 : " + System.identityHashCode(javaStr));
		
		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("JSP ");
		buffer.append("programing is fun");
		
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		System.out.println(buffer);
		
		
		javaStr = buffer.toString();
		System.out.println("새로 만들어진 javastr 메모리 주소 : " + System.identityHashCode(javaStr));
		
		
		
	}

}
