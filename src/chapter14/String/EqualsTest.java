package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		
		//String 클래스는 이미 toString으로 재정의 되어있음
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상우");
		
		System.out.println("------------동일한 주소의 두 인스턴스 비교------------");
		
		//동인한 주소의 두 ㅣㅇㄴ스턴스 비교(물리적 논리적 값이 동일)
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");
		}

		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다");
		} else {
			System.out.println("studentLee와 studentLee2는 동일하지 안흣ㅂ니다");
		}
		
		//물리적 주소는 다르지만 논리적 값이 동일
		System.out.println("----물리적 주소(==)는 다르진만 논리적갑이 동일(equals)");
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다");
		}

		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang는 동일합니다");
		} else {
			System.out.println("studentLee와 studentSang는 동일하지 안흣ㅂ니다");
		}
		
		System.out.println("데이터값출력");
		
		System.out.println("ㄴ셩두싣ㄷ 의 ㅗㅁㄴ호챋ㅇㄷ"+studentLee.hashCode());
		System.out.println(studentSang.hashCode());
		
		System.out.println("ㄴ셩두싣ㄷ 의 ㅗㅁㄴ호챋ㅇㄷ"+System.identityHashCode(studentLee));
		System.out.println("ㄴ셩두싣ㄷ 의 ㅗㅁㄴ호챋ㅇㄷ"+System.identityHashCode(studentSang));
		
		//hashcode가 재정ㅇ,;되엇잇ㅇㅁ
		System.out.println("String 클래스의 실제 ㅓㄱㅄ ㅜ렭");
		
		System.out.println("str1의 ㅗㅁ노챙ㄷ : " + str1.hashCode());
		System.out.println("str2의 hashceode : " + str2.hashCode());
		
		
		
	}

}
