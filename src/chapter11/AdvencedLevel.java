package chapter11;

public class AdvencedLevel extends PlayerLevel{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 점프 합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴은 불가능합니다");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("중급자입니다");
	}

}
