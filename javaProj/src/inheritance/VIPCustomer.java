package inheritance;

public class VIPCustomer extends Customer {		//VIPCustomer는 Customer의 상속을 받는다.
	//멤버변수
	
	//private int customerID;
	//private String customerName;
	//private String customerGrade;
	//int bonusPoint;
	//double bonusRatio;
	
	private int agentID;		//VIP전담 담장자	
	double saleRatio;			//할인비율
	
	//생성자
	/*	public VIPCustomer() {
		customerGrade = "VIP"; 	
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}	*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);		//상위클래스 생성자 호출, super 자체가 this와 비슷하게 상위클래스(Customer)를 지칭함.
		customerGrade = "VIP"; 	
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	
	
	//메서드
	/*
	public int calcPrice(int price) {	//계산법, 입력한 가격에서 할인된 가격 return할 것
		bonusPoint += price * bonusRatio; //포인트계산
		return (int)(price - price*saleRatio);	
	}
	*/
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	//할인된 가격을 계산하여 변환
	}
	
	public int getAgentID() {		
		return agentID;
	}
	
	/*
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너트포인트는 " + bonusPoint + "점입니다.";
	}
	*/
	
	public String showVIPINfo() {
		return super.showCustomerInfo() + "담당상담원 아이디는 " + getAgentID() + "입니다.";
	}
}	
