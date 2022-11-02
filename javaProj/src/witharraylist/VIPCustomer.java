package witharraylist;


public class VIPCustomer extends Customer {
	//멤버변수
	private int agentID;
	double saleRatio;

	//생성자
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName); // Customer(customerID, customerName), 상위클래스 생성자 호출함.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//메서드
	//@Override
	public int calcPrice(int price) {			//@Override 써줘야하나...
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	//@Override
	 public String showCustomerInfo() {			//@Override 써줘야하나...
		 return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	 }
	 
	 public int getAgentID() {
		 return agentID;
	 }
	
	
}


