package chapter16.generic1;

class MyArrayG<E> {
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++] = obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}
}

public class MyArrayTest2 {
	
	public static void main(String[] args) {
		
		MyArrayG<String> myarray1 = new MyArrayG<>();
		myarray1.add(new String("test"));
		String str = (String)myarray1.get(0);
		System.out.println(str);
		
		MyArrayG<Integer> myarray2 = new MyArrayG<>();
		myarray2.add(new Integer(100));
		Integer num = (Integer)myarray2.get(0);
		System.out.println(num);
		
	}
	
}
