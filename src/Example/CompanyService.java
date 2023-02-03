package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {
	
	CompanyBasics cb;
	Scanner sc = new Scanner(System.in); 
	ArrayList<CompanyBasics> arr = new ArrayList<CompanyBasics>();
	
	public void saveWorker() {
		cb = new CompanyBasics();
		System.out.println("-----직원 등록-----");
		System.out.print("등록할 직원의 이름을 입력하세요 : ");
		cb.setName(sc.next());
		System.out.print("등록할 직원의 부서를 입력하세요 : ");
		cb.setPart(sc.next());
		System.out.print("등록할 직원의 주소를 입력하세요 : ");
		cb.setAddr(sc.next());
		System.out.print("등록할 직원의 생일을 입력하세요 : ");
		cb.setBirthday(sc.next());
		arr.add(cb);
		System.out.println();
	}
	
	
	//System.out.println("찾으려는 직원의 이름이 없습니다");
	
	public void search() {
		boolean tf = true;
		System.out.println("-----직원 검색-----");
		if(arr.size() == 0) {
			System.out.println("저장되있는 직원 정보가 없습니다");
		} else {
			System.out.print("찾으려는 직원의 이름을 입력하세요 : ");
			String sn = sc.next();
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i).getName().equals(sn)) {
					System.out.println(arr.get(i));
					tf = false;
				}
			}
			while(tf) {
				System.out.println("찾으려는 직원의 이름이 없습니다");
				tf = false;
			}
			
		}
		System.out.println();
	}
	
	public void list() {
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
			System.out.println();
		}
	}
	

}
