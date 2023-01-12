package chapter08;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student2 stLee = new Student2();
		stLee.setStudentName("이재민");
		stLee.studentID=stLee.serialNum;
		System.out.println(stLee.StudentName + " " + stLee.studentID);
		System.out.println(Student2.getSerialNum());
		//Student2.serialNum++;
		
		Student2 stKim = new Student2();
		stKim.setStudentName("김창우");
		System.out.println(stKim.StudentName);
		System.out.println(Student2.getSerialNum());
		//Student2.serialNum++;
		
		Student2 stPark = new Student2();
		stPark.setStudentName("박창훈");
		System.out.println(stPark.StudentName);
		System.out.println(Student2.getSerialNum());
		//Student2.serialNum++;

	}

}
