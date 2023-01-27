package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member2;

public class MemberLinkedList {

	private LinkedList<Member2> hashSet;
	
	//생성자를 통한 LinkedList객체생성
	public MemberLinkedList() {
		hashSet = new LinkedList<Member2>();
	}
	
	//addMember
	public void addMember(Member2 member) {
		hashSet.add(member);
	}
	
	//removeMember Itora
	public boolean removeMember(int memberId) {
		Iterator<Member2> it = hashSet.iterator();
		while(it.hasNext()) {
			Member2 member = it.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
		
	}
	
	//showAllMember
	public void showAllMember() {
		for(Member2 member : hashSet) {
			System.out.println(member);
		}
	}
	
	
}
