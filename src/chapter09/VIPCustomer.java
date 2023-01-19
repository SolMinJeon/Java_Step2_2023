package chapter09;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//this.customerID = customerID;
		//this.customerName = customerName;
		customerGrade="VIP";
		bounsRatio=0.05;
		this.agentID = agentID; //전문 상담원
		this.saleRatio=0.1;
	}


	@Override
	public int calcPrice(int price) {
		bounsPoint = (price - (int)(price*saleRatio))*bounsRatio;
		return super.calcPrice(price);
		//return price;
	}


	@Override
	public String showCustomer() {
		// TODO Auto-generated method stub
		return super.showCustomer()+"\n전문상담원은 "+agentID+"입니다";
	}


	public int getAgentID() {
		return agentID;
	}
	
	
	
}
