package chapter16.generic1;

public class GenericMain {
	
	public static<T, V> double makeReckangle(Point<T, V> p1, Point<T, V> p2) {
		//double left = (double)p1.getX();
		double left = ((Number)p1.getX()).doubleValue(); //왼쪽 T
		double top = ((Number)p1.getY()).doubleValue(); //위 VvVvVvVvVvVvVvVvVvVvVvVvVv
		
		double right = ((Number)p2.getX()).doubleValue(); //오른쪽 T
		double bottom = ((Number)p2.getY()).doubleValue(); //아래 V
		
		double width = right-left;
		double height = bottom-top;
		
		return width * height;
	}

	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = makeReckangle(p1, p2);
		//double rec = GenericMain.makeReckangle<Integer, Double>(p1, p2);
		System.out.println("두 point로 만들어진 사각형의 넓이 : "+rect+"입니다");
		
		
		
		
		

	}

}
