package chapter15;

import java.nio.Buffer;

public class StBufferMain1 {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer("nice day");
		
		System.out.println(buf.toString());
		System.out.println(buf.length()); //8
		//StringBuffer의 기본 용량 16 + 추가(8) = 24
		System.out.println(buf.capacity());
		//24를 넘어가면 허용범위(26 ~ 50)까지는 50 / 51 ~ 갖고있는 용량
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());
		
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		
		buf.insert(12, " everybody");
		System.out.println(buf);
		
		buf.delete(0, 4);
		System.out.println(buf);

	}

}
