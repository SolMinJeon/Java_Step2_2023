package chapter17.arraylist_stack_qeue;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순긴");
		list.add("강감찬");
		list.add("을지문걱");
		list.add("김유신");
		
		System.out.println(list);
		
		System.out.println("list[0] : " + list.get(0));
		System.out.println("list[2] : " + list.get(2));
		
		

	}

}
