package witharraylist;

public class GoldCustomer extends Customer {
	//멤버변수
	double saleRatio;
	
	//생성자
	public GoldCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	
	//메서드
	//@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	

}
