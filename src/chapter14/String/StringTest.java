package chapter14.String;

public class StringTest {

	public static void main(String[] args) {

		String str = "";
		String str1 = "Hi everybody";
		String str2 = "Have a nice Day";
		
		System.out.println(System.identityHashCode(str1));
		
		str = str1 + str2;
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		//str1의 다른주소 생성
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //주소다름
		
		//str1의 같은주소 생성
		str = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //주소같음
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println(str1.indexOf('d'));
		System.out.println(str2.indexOf('D'));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		
		
		

	}

}
