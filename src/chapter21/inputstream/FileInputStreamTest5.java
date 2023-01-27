package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("resource.txt", true); FileInputStream fis = new FileInputStream("resource.txt")) {
			//쓰기
			fos.write(65); //A 대응되는 문자로 출력
			fos.write(66); //B 대응되는 문자로 출력
			fos.write(67); //C 대응되는 문자로 출력
			//읽기
			System.out.print((char)fis.read() + " ");
			System.out.print((char)fis.read() + " ");
			System.out.print((char)fis.read() + " ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
