package chapter09;

public class C extends A{
	
	public C() {
		super();
		this.field = "VALUE";
		this.method();
	}
	
	public static void main(String[] args) {
		C c = new C(); //자식
		c.method(); //부모클래스
	}

}
