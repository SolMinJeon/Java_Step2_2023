package chapter10;

public class Taxi extends Bus{
	
	private int TaxiNum = 1005;

	@Override
	public void run() {
		System.out.println(TaxiNum + "번 택시가 달립니다");
	}

}
