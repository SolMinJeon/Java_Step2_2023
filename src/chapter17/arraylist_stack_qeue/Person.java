package chapter17.arraylist_stack_qeue;

public class Person {
	
	//한 사람의 정보 정의
	private String name;
	private int age;
	private String tel;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "이름 : " + name + "  |  나이 : " + age + "  |  번호 : " + tel;
	}
	
	
	

}
