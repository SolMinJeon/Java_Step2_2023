package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//Override 불가능한 메소드
	public final void stop() {
		System.out.println("스포츠카가 멈춥니다");
		speed = 0;
	}

}
