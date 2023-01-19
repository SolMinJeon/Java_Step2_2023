package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.serVolume(5);
		tv.search("www.naver.com");
		System.out.println("-------------------------");
		
		//remote 클래스에 정의 되어 잇는 메소드만 오버라이딩이 인식되어 사용할 수 있음
		Remote rc = tv;
		rc.turnOn();
		rc.serVolume(9);
		//rc.search("www.asd.com");
		System.out.println("-------------------------");
		
		
		Searchable sc = tv;
		//sc.turnOn();
		//sc.serVolume(9);
		tv.search("www.google.com");

	}

}
