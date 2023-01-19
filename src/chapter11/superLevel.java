package chapter11;

public class superLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("매우빨리 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 점프는 합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("한바퀴 턴 합니다");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("고급자입니다");
	}
	
	

}
