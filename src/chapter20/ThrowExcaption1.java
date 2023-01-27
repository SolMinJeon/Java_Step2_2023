package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExcaption1 {
	
	public Class loadClass(String filename, String classname) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		Class c = Class.forName(classname);
		
		return c;
	}
	
	public static void main(String[] args) {
		
		ThrowExcaption1 test = new ThrowExcaption1();
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
