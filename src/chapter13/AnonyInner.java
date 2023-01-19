package chapter13;

public class AnonyInner {
	
	public void test() {
		new TestInter() { //TestInter ti = new TestInter -> ti.printData()
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("화요일");
			}
		}.printData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyInner in = new AnonyInner();
		in.test();

	}

}
