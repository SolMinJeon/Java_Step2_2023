package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP 고객
		int price = 10000;
		System.out.println("---------------VIP고개ㅑㄱ---------------");
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님의 "+vipprice+"원을 지불 완료하였습니다");
		System.out.println(vipcs.showCustomer());
		
		
		System.out.println("---------------일반고객---------------");
		price = 10000;
		Customer cs = new Customer(1005, "동길홍");
		int csprice = cs.calcPrice(price);
		System.out.println(cs.getCustomerName()+"님의 "+price+"원을 지불 완료하였습니다");
		System.out.println(cs.showCustomer());
	}

}
