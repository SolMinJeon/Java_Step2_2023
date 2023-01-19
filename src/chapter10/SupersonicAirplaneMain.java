package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMod = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMod = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();

	}

}
