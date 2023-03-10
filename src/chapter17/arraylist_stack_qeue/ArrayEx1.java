package chapter17.arraylist_stack_qeue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		//Collection -> List -> ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size() : " + list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size() : " + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//인덱스로 접근하는 구조는 깊이가 있으면 있으수록 속도가 느려짐
		//그 문제점을 해결하기 위해 Iterator
		System.out.println("---------------------------");
		//1) List구조의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator();
		
		//2)반복자를 반복문으로 수행
		while(it.hasNext()) { //반복자 안에서 커서가 이동
			int v = it.next(); //unBoxing하여 객체를 기본자료형으로 결과물이 int 언박싱 int-> integer오토박싱
			System.out.println(v);
		}
		
	}

}
