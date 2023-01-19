package chapter11;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프는 불가능합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴은 불가능합니다");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("초보자입니다");
	}
	
	

}
