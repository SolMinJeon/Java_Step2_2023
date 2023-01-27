package chapter17.linkedlist;

import chapter17.Member2;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		MemberLinkedList memberLinkedList = new MemberLinkedList();

		
		memberLinkedList.addMember(new Member2(1, "asd"));
		memberLinkedList.addMember(new Member2(2, "dsa"));
		memberLinkedList.addMember(new Member2(3, "sad"));
		
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(1);
		memberLinkedList.showAllMember();

	}

}
