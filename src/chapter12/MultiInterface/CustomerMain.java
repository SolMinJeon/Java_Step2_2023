package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("-----Buy-----");
		
		Buy buy = customer;
		buy.buy();
		buy.order();
		
		Sell sell = customer;
		sell.sell();
		sell.sellorder();
		//sell.order();
		
		//sell 부모 / Customer 자식
		if(sell instanceof Customer) {
			Customer customer2 = (Customer)sell;
			System.out.println("---Down Chasting---");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			customer2.order();
			
		}
		
		customer.order();

	}

}
