package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM일 dd일 hh시 mm분 ss초");
		//String strNow2 = sdf.format(now);
		String strNow2 = sdf.toString();
		System.out.println(strNow2);

	}

}
