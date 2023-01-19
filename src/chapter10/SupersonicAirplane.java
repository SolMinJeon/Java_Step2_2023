package chapter10;

public class SupersonicAirplane extends Airplane{
	
	//NORMAL = 1 SUPERSONIC = 2
	//필드(전역변수)
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMod = NOMAL;

	@Override
	public void fly() {
		
		if(flyMod == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		} else {
			super.fly();
		}
	}
	
	

}
