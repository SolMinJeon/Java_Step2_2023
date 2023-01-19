package chapter17.list;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("oracle");
		list.add("servlet/jsp");
		list.add(2, "spring");
		list.add("python");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			//String str = list.get(i);
			//System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("python");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
	}

}
