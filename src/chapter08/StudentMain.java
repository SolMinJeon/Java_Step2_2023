package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student1 stLee = new Student1();
		stLee.setStudentName("이재민");
		stLee.studentID=stLee.serialNum;
		//System.out.println(stLee.getStudentName());
		System.out.println(stLee.StudentName);
		//System.out.println(stLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		
		Student1 stKim = new Student1();
		stKim.setStudentName("김창우");
		System.out.println(stKim.StudentName);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		
		Student1 stPark = new Student1();
		stKim.setStudentName("박창훈");
		System.out.println(stPark.StudentName);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		
	}

}
