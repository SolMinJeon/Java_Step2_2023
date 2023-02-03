package Example;

public class CompanyBasics {
	
	private String name;
	private String part;
	private String addr;
	private String birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.getName() + 
				"\n부서 : " + this.getPart() + 
				"\n주소 : " + this.getAddr() + 
				"\n생일 : " + this.getBirthday();
	}
	
	

}
