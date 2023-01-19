package chapter17.stack_queue;

import java.util.Stack;

public class StackTest1 {
	
	public static void main(String[] args) {
		
		Object obj;
		//empty 스택 생성
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {
			for(int i=0; i<=5; i++) {
				st.push(new String("Hi" + i));
				System.out.println(" 입력" + i + "번째 : " + st.peek());
			}
		}
		
		st.pop();
		System.out.println("현재 Top의 위치(peek) : " + st.peek());
		st.push(new String("Happy"));
		System.out.println(st.peek());
		
		
	}

}
