package chapter09;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bounsPoint;
	protected double bounsRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bounsRatio=0.01;
	}
	
	
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bounsRatio=0.01; //포인트비율
	}
	
	
	//ㅠㅗ인트와 가격
	public int calcPrice(int price) {
		bounsPoint += bounsRatio*price;
		
		return price;
	}
	
	public String showCustomer() {
		return customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bounsPoint+"원 입니다";
	}
	
	


	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBounsPoint() {
		return bounsPoint;
	}
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public double getBounsRatio() {
		return bounsRatio;
	}
	public void setBounsRatio(double bounsRatio) {
		this.bounsRatio = bounsRatio;
	}
	
	
	
	

}
