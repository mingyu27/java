package inheritance;

public class Customer {
	//멤버번수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;	//포인트
	double bonusRatio; //적립비율
	
	//생성자
	/*
	public Customer() {
		customerGrade = "SILVER"; //기본등급
		bonusRatio = 0.01; //기본적립비율
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //기본등급
		bonusRatio = 0.01; //기본적립비율
		System.out.println("Customer(int, String)생성자 호출");
	}
	
	//get()
	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	
	//set()
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	//메서드
	public int calcPrice(int price) {			//포인트계산, 입력한 가격은 그대로 return;
		bonusPoint += price * bonusRatio; // 포인트계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다. ";
	}
	
	
}
