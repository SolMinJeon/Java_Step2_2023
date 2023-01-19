package chapter17.arraylist_stack_qeue;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {
	
	//AttayList 선언
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		//heap 생성
		arrayList = new ArrayList<Member>();
	}
	
	//저장 : arrayList에 add 하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//삭제 : arrayList에 remove 하는 메소드
	public boolean removeMember(int memberId) {
		Iterator<Member> it = arrayList.iterator(); 
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	//정보출력 메소드 : arrayList 출력하기
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
