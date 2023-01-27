package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExcaption2 {
	
	public Class loadClass(String filename, String classname) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		Class c = Class.forName(classname);
		
		return c;
	}
	
	public static void main(String[] args) {
		
		ThrowExcaption2 test = new ThrowExcaption2();
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) { //논리연산자 , > < >= <= 등 사용가능
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
