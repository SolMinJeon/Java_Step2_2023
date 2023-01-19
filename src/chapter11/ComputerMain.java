package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들수 없다
		//Computer c1 = new Computer();
		//Computer c1 = new NoteBook();
		Computer c2 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c2.typing();//desktop
		c2.display(); //desktop
		c4.typing(); //mynotebook
		c4.display(); //NoteBook
	}
	
}
