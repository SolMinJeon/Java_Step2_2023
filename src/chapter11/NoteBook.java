package chapter11;

public abstract class NoteBook extends Computer{

	
	//상속받은 두개의 추상메소드중 하나만 정의해서 사용할 경우 추상 클래스로 구현됨
	@Override
	public void display() {
		
		System.out.println("NoteBook display");
		
	}

	
	

}
